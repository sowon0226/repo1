
-- 오라클 문법을 사용한 대댓글 조회 --
select level, empno, lpad(' ',2,level) || ename, mgr from emp
start with mgr is null -- 시작점
connect by prior empno = mgr
order siblings by empno desc;

-- 보편적인 문법을 사용한 대댓글 조회--
with emp_recu(lv,empno, ename, mgr) as (
    select 
        1 as lv,
        empno, ename, mgr
    from emp  -- 대상 테이블
    where mgr is null --원글
    
    union all
    
    
    select
        er.lv + 1 as lv,
    
        e.empno, lpad(' ',2*er.lv) || e.ename, e.mgr 
    from emp_recu er
    left outer join emp e on er.empno = e.mgr 
    where e.mgr is not null -- 원글을 제외하는 조건
    )
search depth first by empno desc set sort_empno_desc -- 정렬에 대한 정의 및 별칭
select * from emp_recu
order by sort_empno_desc; -- 정렬 별칭을 활용

-- 페이징을 하기 위해서
-- 한 페이지에 몇개씩 보여 주는가?
-- 지금 몇 페이지 인가?

-- 페이징
select 
    rownum, empno, ename
from emp
where rownum < 5 -- 우연임
order by empno desc;

-- 미리 ()가 동작 후 where 동작 후 select가 동작
-- 한번에 3개씩 보여주는데 2번째 페이지여서 4,5,6이 보이는거
select *
from(
    select rownum rnum, empno, ename
    from (
        select empno, ename
        from emp2
        order by ename 
    )
)
where rnum >= 4 and rnum <= 6;

insert into emp2
select * from emp;

select *from emp2;

commit;













-- 오류
select rownum, empno, ename
from (
    select empno ename
    from emp
    order by ename 
)
where rownum >= 4 and rownum <= 6;