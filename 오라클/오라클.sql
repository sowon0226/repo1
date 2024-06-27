-- 한줄 주석
/* 범위 주석*/
select 
    * -- 모든 컬럼을 뜻함 , 이 안에서 반복이 된다?
from 
   emp; -- ; 안쪽 까지만 실행 명령임/ (emp는 테이블 명) 직원이라는 뜻
   -- select와 from은 항상 같이 다님
   -- from 다음은 테이블 명이 옴
 select 
    empno, ename, deptno
from 
   emp;  
-- 모든 컬럼(행)
FROM
    emp; -- ;과 ;사이를 실행시켜준다
-- sql developer 자동 정렬 단축키 : ctrl + F7
SELECT
    empno,  -- 조회하고 싶은 컬럼 명들
    ename,
    deptno
FROM
    emp;

select * from dept;
select * from salgrade;

select deptno from emp;
-- 한줄 복사 단축키 : Ctrl + shift + d

-- distinct : select에서 중복되는 자료를 제거해준다
select distinct deptno from emp;
-- 컬럼이 여러개인 경우 컬럼들의 조합이 중복되는걸 제거해준다
select distinct job from emp;

select distinct deptno, job from emp; --distinct는 두개의 컬럼에서 중복된 것을 지워줌

-- null과 연산하면 무조건 null이 나온다
select ename, sal, sal*12+comm, comm from emp;
-- 컬럼명에 별칭 사용
-- " 생략 가능
-- as 생략 가능
-- 별칭 안에 띄어쓰기가 있는 경우 " 생각 불가
-- 가능하면 띄어쓰기 보다  _를 넣자
select ename, sal, sal*12+comm as new_sal, comm from emp; 


-- order by : 해당 컬럼으로 정렬해줌 (오름차순 내림차순만 가능함)
-- 오름차순 : asc 생략가능
-- 내림차순 : desc 정렬만
-- 작은것 부터 큰 순서대로 정렬해줌 (데이터를 순서대로 정렬 할 때 사용)
select * from emp
order by sal asc;

-- null이 밑으로 내려감(null은 정렬인 안되어있음)
select * from emp
order by comm;
-- 큰것부터 작은 순서대로 정렬
select * from emp
order by sal desc;

-- order by 첫번째거로 정렬하고
-- 그 중에 같은게 있다면 다음거로 정렬하고
-- 그 중에 같은게 있다면 다음거로 정렬하고
select * from emp
order by deptno asc, sal desc;
-- p92 문제 2번
select distinct job from emp
order by job; -- 알파벳 정렬

-- where : 필요한 데이터만 출력하는 방법
-- deptno가 30인 것만 출력
select * from emp
where deptno = 30;
-- p.95 1분 복습
select * from emp
where empno = 7782;

-- 2000보다 크거나 같다를 표현 할 때
select * from emp
where sal >= 2000
order by sal;

-- king만 뽑을 때
select * from emp
where ename = 'KING';

select * from emp 
where deptno = 30 and job = 'SALESMAN'

select * from emp 
where job = 'CLERK' and deptno = 30,
-- 에러가 남 
select * from emp 
where job = 'CLERK' and deptno = 30 or deptno = 20;
-- clerk가 20 또는 30일 때
-- and 가 먼저 실행되므로 ()를 써줘야함
select * from emp 
where job = 'CLERK' and (deptno = 30 or deptno = 20);
-- 2000 보다 크고 3000 보다 작을 때
select * from emp
where sal >= 2000 and sal < 3000;

-- 같지않다 !=, <>, ^=
select * from emp
--where sal != 3000;
where sal <> 3000; -- 같지 않다는 표현

-- not
select * from emp
where not (sal >= 2000 and sal < 3000);

select * from emp
where job in ('MANAGER', 'SALESMAN', 'CLERK');

-- in과 or가 동일하다는 말
select * from emp
where job in = 'MANAGER'or job = 'SALESMAN'or job 'CLERK';
-- in 앞에 not을 붙일 수 있음
select * from emp
where job not in ('MANAGER', 'SALESMAN', 'CLERK');

select * from emp
where sal >= 2000 and sal <= 3000;
-- >=, <= 기호 대신에 between A(최솟값) and B(최댓값)로 쓴다
select * from emp
where sal between 2000 and 3000;

select * from emp
where sal not between 2000 and 3000;

-- like : 패턴을 찾을 수 있음
-- 예) 'S%' %와일드 카드로 특정 문자 또는 문자를 찾을 때 사용
-- % 어떤거든 관계없음 (글자의 길이에 상관이 없다)
-- S로 시작하는 모든것을 찾을 때
-- like를 사용 시 index를 사용 할 수 없다
select * from emp
where ename like 'S%';
-- like가 아니다 라고 표현하고 싶을 때 like 앞에 not을 붙이면 됨
select * from emp
where ename like 'A%';
-- '_L%' 일때는 이름에 두번째 자리에 A가 들어가는 이름을 찾기
select * from emp
where ename like '_L%';
-- _는 딱 한글자인데 어떤 글자든 관계없음 
select * from emp
where ename like '____%';
-- %AM%은 글자 길이에 상관없이 이름에 AM이 들어간 것을 찾을 때
select * from emp
where ename like '%AM%';
-- 이하일 때는 400이 포함이 되는지 확인 후 사용하기
-- null은 비교가 안됨 그래서 null이 빠짐
-- null은 연산이 안됨
select * from emp
where comm <= 400;
-- \ 뒤에 오는 것은 순수한 문자로 알려줘?

select * from emp
where comm = null; --은 사용이 안됨
-- null은 연산이 안되므로 is null로 사용해야함
-- not을 사용 하고 싶을 때는 is no null로 사용해야함
select * from emp
where comm is null;
-- 0은 null이 아님 0은 그냥 0임
select * from emp
where comm is not null;
-- and, or은 true인지 false인지 확인할 때 사용
select * from emp
where sal > null and comm is  null;

select * from emp
where sal > null or comm is  null;

-- emp에서 deptno가 10 또는 20인 사원의
-- empno, ename, sal, deptno에서 출력
select empno, ename, sal, deptno from emp
-- where deptno = 100 or deptno = 20;
where deptno in (10, 20);
-- 타입이 같을 때 union을 써주면 합쳐줌
-- 서로 다른 조회 결과물(테이블)을 합쳐준다
-- 단, 조회한 컬럼의 개수, 타입이 같아야함
-- 예) empno, ename, sal, deptno - empno, deptno, ename, sal
-- 컬럼 타입의 순서가 바뀌면  출력인 안됨
-- union : 중복된 자료를 제거해준다
select empno, ename, sal, deptno from emp
where deptno = 10
union -- 값이 같을 때 중복된 자료를 제거 후 합쳐줌
select empno, ename, sal, deptno from emp
where deptno = 10;
-- union all : 중복에 관계없이 합쳐준다 (실무에서는 union all만 사용)
select empno, ename, sal, deptno from emp
where deptno = 10
union all -- 값이 같을 때 중복된 자료 상관없이 모두 합쳐줌
select empno, ename, sal, deptno from emp
where deptno = 10;

-- minus, intersect는 오라클에서만 사용가능
-- p.125
-- Q1
select * from emp
where ename like '____S%'; -- ename like '%S';으로 사용 가능
-- Q2
select empno, ename, job, sal, deptno from emp
where job = 'SALESMAN';
-- deptno = 30 and job = 'SALESMAN'으로 사용 가능
-- Q3
-- 3-1
select empno, ename, job, sal, deptno from emp
where sal > 2000 and deptno in(20, 30);
-- 3-2 
select empno, ename, job, sal, deptno from emp
where sal > 2000 and deptno = 20 
union 
select empno, ename, job, sal, deptno from emp
where sal >= 2000 and deptno = 30;
-- Q4
select * from emp
where  not (sal >= 2000 and sal <= 3000);
-- not을 쓸 때 ()를 안써주면 앞에꺼만 포함됨
-- Q5
select * from emp  -- ename, empno, sal, deptno
where ename like '%E%' and not (sal > 1000 and sal < 2000) and deptno = 30;
-- Q6
select * from emp
where ename not like '_L%' 
and comm is null
and mgr is not null 
and job in ('MANAGER', 'CLERK');

select ename, upper(ename), lower(ename), initcap(ename) from emp;
-- upper, lower는 대소문자 구분 없이 like할때 딱 좋다
-- upper, lower 다시 여쭤보기
select * from emp
where lower (ename) like lower('%Mi%');

-- length 문자 길이(개수)
select ename, length(ename) from emp;
select * from emp
where length(ename) >=5;
-- dual : 임시 테이블 
select length('한'), lengthb('한') from dual;

-- 0번도 1과 같음
-- substr : 대상이 되는 문자, 시작 위치, 가져올 개수
-- 가져올 개수를 안쓰거나 너무 크면 끝까지 
select job, substr(job, 1, 2), substr(job, 0, 2),
substr(job, 3, 3),
substr(job, 5), 
ename,
substr(job, -3, 2 ),
length( lower ( substr(job, 5, 100) ) )
from emp;

-- job에서 A를 *로 바꿔라
-- replace('대상', '찾을 대상', '바꿀 문자')
select job, replace(job, 'A', '*') from emp;

select 
    job,
    length(job),
    (length(job)+1) / 2,
    substr(job, (length(job)+1) / 2, 1),
    replace (
    job,
    substr(job, (length(job)+1) / 3, 1),
    '*'
    )
from emp;

-- lpad,rpad ([문자열 데이터 또는 열이름],[데이터의 자릿수(필수)],[빈공간 채울문자(선택)])
-- lpad : 대상이 되는 문자, 전체 자리수, 채울 문자
-- 채울 문자 생략시 공백 문자
select 
    job,
    lpad(job, 10, '#'),
    lpad(job, 4, '#')
from emp;

select 
    job, length(job), 15 - length(job)
from emp;

select 
    rpad(
        lpad (
            job,
            --( 16 - length(job) / 2 ), '*')
            ( 16 - (length(job) ) ) / 2  + length(job),
             '*'
             ),
             ( 16 - (length(job) ) ) / 2 + length (lpad (
             job,
             ( 16 - (length(job) ) ) / 2 + length(job),
             '*')
            ),
        '*')
from emp;
-- 문자열 더하기
select empno || ename || '님'
from emp;

-- trim : 앞 뒤 공백 제거
-- 글씨 사이의 공백은 제거하지 않음
select 
    ' a b c     ',
    trim( ' a b c     ')
from dual;    

-- 실습문제 1
select 
    '210621-3123456',
    '210621-3******'
from dual;
-- 첫번째 방법
select 
    '210621-3' || '******'
from dual;    
-- 두번째
select 
    substr('210621-3123456', 1, 8) || '******',
    rpad('210621-3', 14, '*'),
    rpad(
      substr('210621-3123456', 1, 8),
      length('210621-3123456'),
      '*'
      )
from dual;

-- 실습 문제 2
-- 사원의 이름을 앞에 두자리만 보이게 하고 나머지는 *로 표시
-- 정답의 예 : WARD -> MA** , MARTIN -> MA****
-- 쉬운버전 : 앞에 두 글자 + '***'
select
    lpad(ename, 2),
    rpad(lpad(ename, 2),8 ,'*')
from emp;    

-- 실습 문제 3
-- 앞 글자 하나만 
-- WARD -> *ARD , MARTIN -> *ARTIN
select 
    ename,
    lpad(substr(ename, 2), length(ename), '*')
    from emp;
-- 실습 문제 4
-- 두번째 글씨만 *
-- WARD -> W*RD, MARTIN -> M*RTIN
select
    ename,
    substr(ename, 1, 1) || '*'|| substr(ename,3)
    -- lpad와 rpad로만으로 안돼는 이유는 글자를 자른 후 붙여주기를 못함으로
    -- || 더하기 표시를 사용해서 붙여 줘야함
from emp;    
-- 실습 문제 5 
-- 가운데 글씨만 *
-- WARTIN -> W*RTIN, SCOTT -> SC*TT
select
    ename,
    substr(ename,1 , length(ename) /2-0.5)|| '*'||
    substr(ename,length(ename)/2+1.5 )
    -- 위에서는 0.5을 버리고
    -- 아래에서는 버린 0.5을 주워와서 1.5을 더해줌
from emp;

select ename from emp;

-- 선생님과 함께 풀이함
-- 실습 문제 2
-- 사원의 이름을 앞에 두자리만 보이게 하고 나머지는 *로 표시
-- 정답의 예 : WARD -> MA** , MARTIN -> MA****
-- 쉬운버전 : 앞에 두 글자 + '***'
select
    -- 방법은 2가지가 있음
    ename,
    rpad( substr( ename, 1, 2),length(ename), '*')
from emp;
-- 실습 문제 3
-- 앞 글자 하나만 
-- WARD -> *ARD , MARTIN -> *ARTIN
select '*' || substr(ename,2) from emp;
-- 실습 문제 4
-- 두번째 글씨만 *
-- WARD -> W*RD, MARTIN -> M*RTIN
select substr(ename, 1, 1) || '*' || substr(ename, 3) from emp;
-- 실습 문제 5 
-- 가운데 글씨만 *
-- WARTIN -> W*RTIN, SCOTT -> SC*TT
select 
    length(ename)/2 + 1,
    substr(ename, 1, length(ename)/2) ||'*'|| substr(ename, length(ename)/2 +2)
from emp;    

-- trunc : 소수수점 이후 버림
select
    trunc(1234.5678),
    trunc(1234.5678, 2), -- 소수점 2번째 이후 버림
    trunc(1234.5678, -2), -- 앞 두번째 자리부터 버림
    trunc(-12.34)
from dual;

-- ceil : .이후 모두 올림 나보다 가까운 큰 정수 쪽으로 감
-- floor : . 이후 모두 버림 나보다 작은 정수 쪽으로 감
select
    ceil (3.14), 
    floor(3.14),
    ceil(-3.14), -- -3이 나온 이유 : -일 때 올림은 나보다 큰 정수로 표현
    floor(-3.14) -- 
from dual;

-- sysdate : 날짜 함수 (+9시간을 해줘야 우리나라 시간임)
-- 지금 오라클 pc의 시간이 나옵니다
-- 강사 pc는 9시간 차이가 난다(영국 0시 기준 한국 +9시)
-- 날짜 정보 중 일부만 select로 표시됨
-- 오라클은 윤년, 윤달 계산이 제일 정확함
select sysdate, sysdate+1, sysdate-1 from dual;

-- add_months : 한달 뒤를 출력할 때 사용하는 코드
-- 컬럼에 +를 적으면 모두 숫자로 변경해서 적용함
-- || 숫자도 문자로 적용
select -- 9시간을 더할 때 sysdate+(9/24)로 표현함
    to_char (sysdate, 'YYYY"년"/MM"월"/DD"일" HH24"시":MI"분":SS"초"')
from dual;

-- to_number : ?
select -- 오늘 날짜 - 원하는 날짜 
    sysdate - to_date('2024-05-07', 'yyyy-mm-dd'),
    'YYYY"년"/MM"월"/DD"일" HH24"시":MI"분":SS"초"'
from dual;

-- null 처리함수 ( null 앞에 nvl을 써야함, nvl은 오라클만 사용가능)
-- null은 무한대여서 더하든 곱하든 null임
-- 필요한 경우 문자가 들어갈 수 있다
select
    comm,
    nvl(comm, -1),
    sal,
    sal + comm,
    sal + nvl(comm, 0) 
from emp;

-- where 조건에서도 nvl을 사용가능
-- where 조건은 무조건 참인 것을 알려줌
-- 삼항 연산자 nvl2에서
-- '0','X'는 널인경우 0을 표시 
select *from emp
where nvl(comm, 0) = 0; -- null일 경우 null이 0이고, 결과 값도 0인 조건만 출력됨

-- case문 case 는 when,then이 한 묶음 (예) if->else if->else느낌
-- case로 시작해서 end로 닫아줌
-- decode는 모든 case문으로 바꿀수 있지만, case문은 decode로 바꿀 수 없다
select
    case 
        when
            comm is null
            then
                'N/A' -- 숫자
        else
             to_char(comm) -- comm은 문자여서 to_char를 이용해 숫자로 변환
           -- ''||comm 위 아래 둘다 사용 가능
    end new_comm
from emp;    
-- nvl 사용하는법
-- null 처리 할 때 nvl을 사용해서 코딩하는법
select
    case 
        when
            comm is null
            then
                0 --(nvl)
        else
             comm 
    end new_comm
from emp;    

-- p.174 
-- Q2
select
    empno,ename,sal,
    trunc(sal/21.5, 2) as DAY_PAY,
    round(sal/21.5 /8, 1) as TIME_PAY
from emp;
-- p.175
-- Q3
select
    empno, ename,
    to_char(hiredate,'YYYY/MM/DD' )as hiredate,
    to_char (add_months(hiredate, 3), 'YYYY-MM-DD' )as R_JOB, 
    case when comm is null then'N/A' else to_char(comm)end comm
from emp;
-- Q4
select
    empno,ename,
    mgr,
   -- substr(mgr, 0, 2),
    case
    when mgr is null then '0000'
    when substr(mgr, 0, 2) = 75 then '5555'
    when substr(mgr, 0, 2) = 76 then '6666'
    when substr(mgr, 0, 2) = 77 then '7777'
    when substr(mgr, 0, 2) = 78 then '8888'
    else to_char(mgr)
    end as CHG_MGR
from emp;
-- 선생님과 함께 푼 방식
-- Q2
select
    empno, ename, sal,
    trunc(sal/ 21.5, 2) as day_pay,
    round((sal/ 21.5) / 8, 1)time_pay1,
    trunc(sal/ 21.5, 2) /8 time_pay2
from emp;
-- Q3
select empno, ename, hiredate,
    to_char (add_months(hiredate, 3), 'yyyy/mm/dd') as r_job_0,
    next_day(add_months(hiredate, 3), 2) as r_job_1, -- 일욜1, 월욜2,.....토욜7
    comm,
    nvl(to_char(comm), 'N/A'),
    to_char(null),
    case
    when comm is null then 'N/A'
    else to_char(comm)
    end,
    decode(comm,
    null, 'N/A', -- decode는 to_char안써도 알아서 해줌
    comm)
from emp;
-- Q4
select
    empno,ename,mgr
case
    then mgr is null then '0000'
    else 
        case
        when substr(mgr, 1, 2) =75 then '5555'
        when substr(mgr, 1, 2) =76 then '6666'
        else to_char(mgr)
        end
end chg_mgr_1,
case 
    when mgr is null then '0000'
    else   
        case substr(mgr, 1, 2)
        when '75' then '5555'
        when '76' then '6666'
        else to_char(mgr)
    end
end chg_mgr_2,
case
    when mgr is null then '0000'
    when mgr like '75%' then '5555'
    when mgr like '76%' then '6666'
    else to_char(mgr)
end chg_mgr_3,
case
     when mgr like '75%' then '5555'
    when mgr like '76%' then '6666'
    else nvl (to_char(mgr), '0000')
end chg_mgr_4, 
case 
    when substr(mgr, 2, 1) 
from emp;    

-- select sum(sal), sal from emp; sal 병합이 안됨
-- count처럼 null은 제외 됨
-- count에서는 *를 많이 씀
select sum(sal), count(sal),count(*), count(comm) from emp;

select count(*) from emp where ename like '%A%';
-- 앞에 max와 뒤에 max는 관계가 없음
-- avg 평균값
select max(sal), max(ename), min(hiredate), min(comm), avg(sal) from emp;

-- 부서별 급여 총 합, 평균 표시
-- deptno, sum, avg
select
    sum(sal), avg(sal)
from emp
where deptno = 10
union all
select
    sum(sal), avg(sal)
from emp
where deptno = 20
union all
select
    sum(sal), avg(sal)
from emp
where deptno = 30;

-- distinct처럼 중복을 제거해줌, 분류해줌
-- select에는 group by한 것이나 다중행 함수(집계함수)만 올 수 있음 
select deptno, avg(sal), sum(sal), count(*) from emp
group by deptno; -- from 뒤에 group by를 쓸 수 있다 그 앞에 적으면 에러
-- group by는 ,를 이용해서 넣을 수 있다
-- count(*)은 중복된 것을 알려줌
select deptno, empno from emp
group by deptno, empno; 

select deptno, job, count(*)
from emp
group by deptno, job -- select에 있는 것만 group by에 적을 수 있다
order by deptno, job; -- order by는 group by에 있는 것만 적을 수 있음

select deptno, job, count(*)
from emp
-- where count(*)>2 에러남
group by deptno, job 
order by deptno, job;

-- having : group by에서만 사용된다.
-- 집계함수를 조건으로 걸고 싶은 경우에 사용
-- group by의 조건절
select deptno, job, avg(sal)
from emp
group by deptno, job
   -- having avg(sal) >= 2000;
   -- having count(*) >= 2;
   having deptno = 20;
   
-- p.212 
-- Q1
select
    deptno, trunc(avg(sal)),max(sal), min(sal), count(*)
from emp
group by deptno;

-- Q2
select job, count(*) from emp group by job
having count(*) >= 3; -- where 조건으로 쓸 수 있음, 또다른 테이블을 만들어서 넣음

select * from dept;

-- 순서
/* 5 */select job, count(*) cnt -- 어떤것을 할지 결정 후에
/* 1 */from emp 
/* 2 */where sal > 1000 -- count을 같이 못씀
/* 3 */group by job
/* 4 */having count(*) >= 3
/* 6 */order by cnt desc; -- 정렬

-- 오라클은 내가 갖고 있는 데이트를 모두 보여줌
-- 조건을 걸면 원하는 조건만 보여줌
select * 
from emp, dept
order by empno;

select 14 * 4 from dual;

-- 조인 기법
-- 테이블 두개이면 둘을 엮는 조건을 찾아야함
select * 
from emp, dept
where emp.deptno = dept.deptno
order by empno;

-- 주석처리 된 것은 사용 안됨 에러남
select emp.ename, /* emp.loc */ dept.loc, /* deptno */ emp.deptno -- ename은 emp에만 있음
from emp, dept
where emp.deptno = dept.deptno -- 테이블명.컬럼명을 뜻함
order by empno;
-- 테이블 두개 이상 조회할 때 관계를 꼭 알려줘야 원하는 정보만 출력된다
-- 전체 테이블 수 - 1개의 조건이 적당하다

-- 별칭을 붙이면 더이상 원래 이름을 못씀
select *
from emp e, dept d -- 여기서는 as는 못씀, "/'못씀
where E.deptno = d. deptno; -- 대소문자 둘다 사용 가능
--where emp.deptno = dept. deptno; 별칭을 줘서 원래 이름 쓰면 에러

select e.ename from emp e; -- 단독으로 쓰고 싶을 때도 별칭을 붙여줌

-- *와 다른 컬럼을 같이 쓰고 싶을 때 *에 테이블을 지정해줘야함
-- 별칭을 붙여줘야함
select ename, d.*
from emp e, dept d 
where E.deptno = d. deptno;

select * from salgrade;

select *
from emp e, salgrade s
where e.sal >= s.losal and e.sal <= s.hisal;


select * from emp;

select *
from emp e1, emp e2
where e1.mgr = e2.empno;

-- using에 둘다 같은 컬럼명이 있는 경우만 쓸 수 있다
-- emp
select *
from emp join dept using (deptno);

-- 두 테이블이 다른 경우에 사용
select *
from emp join dept on (emp.deptno = dept.deptno);

-- king(null)이 안나옴 
select *
from emp e1 join emp e2 on (e1.mgr = e2.empno);

-- king(null)을 나오게함
-- left outer join : 왼쪽 테이블을 모두 출력해주는 것을 보장해준다
-- join을 기준으로 왼쪽 테이블을 모두 출력
-- 없으면 모두 null로 처리함
select *
from emp e1 left outer join emp e2 on (e1.mgr = e2.empno);
-- right outer join : 오른쪽을 모두 출력 왼쪽은 비워있어도 상관없음
select *
from emp e1 right outer join emp e2 on (e1.mgr = e2.empno);

-- Q1
-- empno, ename, dame, loc 출력 : 결과 14줄
select empno, ename, dname, loc  
from emp e, dept d 
where E.deptno = d. deptno;
-- 방법 1
select empno, ename, dname, loc 
from emp, dept
where emp.deptno = dept.deptno;
-- 방법 2
select empno, ename, dname, loc 
from emp join dept using (deptno);
-- 방법 3
select empno, ename, dname, loc 
from emp left outer join dept on(emp.deptno = dept.deptno);
-- Q2
-- 사번, 이름 부서명, 급여등급을 모두 출력 : 결과 14줄
-- 테이블 3개
-- 방법 1
-- salgrade를 사용할 때는  e.sal >= losal and e.sal <= hisal 꼭 같이 써줘야함
select e.empno, e.ename, d.dname, s.grade
from emp e, dept d, salgrade s
where e.deptno = d.deptno
and (e.sal >= s.losal and e.sal <= s.hisal);
-- 방법 2
select e.empno, e.ename, d.dname, s.grade
from salgrade s, emp e join dept d using (deptno)
where (e.sal >= s.losal and e.sal <= s.hisal);
-- 방법 3
select e.empno, e.ename, d.dname, s.grade
from emp e
left outer join dept d on (e.deptno = d.deptno)
left outer join salgrade s on (e.sal >= s.losal and e.sal <= s.hisal);

-- Q3
-- 매니저 보다 월급이 높은 사원의 이름, 급여 매니저 이름, 매니저 급여 출력
select e1.ename, e1.sal, e2.ename, e2.sal 
from emp e1 left outer join emp e2 on (e1.mgr = e2.empno)
where e1.sal > e2.sal;

select e1.ename, e1.sal, e1.mgr, e2.empno, e2.sal
from emp e1, emp e2
where e1.mgr = e2.empno
and e1.sal > e2.sal;
-- p.239
-- Q1
select *from emp;
select * from dept;
select emp.deptno,ename, dname, sal
from emp, dept
where sal > 2000 and emp.deptno = dept.deptno
order by emp.deptno;

select emp.deptno,  emp.empno, emp.ename, emp.sal
from emp, dept
where emp.deptno = dept.deptno
and sal > 2000
order by deptno;
-- Q2
select 
deptno, max(sal), min(sal), count(deptno)cnt,
trunc(avg(sal),0)
from emp
group by deptno
order by deptno;

select d.deptno, d.dname, floor(avg(sal)), max(sal), min(sal),count(*)
from emp e left outer join dept d on (e.deptno =  d.deptno)
group by d.deptno, d.dname;
-- Q3
select dept.deptno, dname, empno, ename, job, sal
from emp right outer join dept on (emp.deptno = dept.deptno) 
order by emp.deptno, ename;

select *
from dept d left outer join emp e on (e.deptno = d.deptno)
order by d.deptno;

-- 서브쿼리
-- 안쪽에 있는 쿼리
select sal from emp where ename = 'JONES';

select * from emp 
where sal >(select sal from emp where ename = 'JONES');
-- where 조건이 없으면 오류가 뜸

select *
from emp
where sal > ( select avg(sal) from emp) and deptno = 20;
-- 평균 급여보다 많이 받는 사람들
select * from emp
where sal > ( select avg(sal) from emp):
-- BLAKE씨 보다 높은 연봉을 받는 사람드
select * fromemp
where sal > ( select sal from emp where enamw = 'BLAKE');
-- JONES 와 같은 job을 가지고 있는 사원들
select * from emp
where job = ( select job from emp where ename = 'JONES');

select * from emp
where sal in(
select max(sal) from emp group by deptno);

select *
from (
    select * from emp where deptno = 10);

-- rownum : 줄 번호    
select rownum, emp.*
from emp
--where rownum = 4; -- 1로 초기화가 되어 있어서 안나옴 where에서 사용이 안됨
order by ename; -- 실행 순서 때문에 (order by는 맨 나중에 실행됨)

select rownum , e.*
from (
    select * from emp order by ename) e;

select job, count(*) from emp
group by job
having count(*) >= 3;

select *
from ( select job, count(*) cnt from emp
       group by job)
where cnt >= 3; -- cnt별칭을 붙여주고 사용, having을 안쓰고 쓰는 방법

-- wuth는 무조건 select 앞에 적어야 실행 됨
with e10 as (
            select * from emp where deptno = 10)
select * from e10; 
select * from dept;
select * from salgrade; 
-- p.262
-- Q1
select job, empno, ename, sal, deptno from emp
where job =( select job from emp where ename = 'ALLEN');

select job, empno, ename, sal, deptno, danme 
from emp join dept using (deptno)
where job = (select job from emp where ename = 'ALLEN')
order by sal desc, ename;
-- Q2
-- 일단 전체사원의 평균 급여를 조회
select avg(sal) from emp;
select empno, ename, sal from emp, dept, salgrade
where sal > (select avg(sal) from emp);

-- 일단 전체사원의 평균 급여를 조회
select avg(sal) from emp; --2073......
select * from emp e, dept d, salgrade s
where 
    e.deptno = d.deptno
    and e.sal >= s.losal and  e.sal <= s.hisal
    and sal > (select avg(sal) from emp)
order by sal desc, empno;
-- Q3
select e.empno, e.ename, e.job, d.deptno, d.dname, d.loc
from emp e, dept d
where e.deptno = d.deptno
and e.deptno = 10, 30; 

select empno, ename, job, e.deptno, dname, loc
from emp e
left outer join dept d on (e.deptno = d.deptno)
where e.deptno = 10
and job not in ( select job
                from emp
                where deptno =30);

-- Q4
select e.empno, e.ename, s.sal, s.grade from emp e
where sal in (select max(sal) from emp group by empno);

select empno, ename, job, e.deptno, dname, loc  from emp e
lefr outer join salgrade s
on (e.sal >= s.losal and e.sal <= s.hisal)
where sal > (select max(sal) from emp where job ='SALESMAN');
                    -- 10장
create table dept_temp
as select * from dept;

select * from dept_temp;

-- 테이블에 데이터를 추가(열 추가)
insert into dept_temp(deptno, dname, loc)
                values(50, 'DATABASE', 'SEOUL');
                
select * from dept_temp;         

insert into dept_temp
values (60, 'network', 'Busan');

select * from dept_temp;
-- 테이블명 뒤에 ()생략하면 모든 컬럼 에러
insert int dept_temp
values ('network', 60, 'Busan');

insert into dept_temp(deptno, dname, loc)
values (70, '웹', null);

select * from dept_temp;

-- ''도 null로 보이는데 그래도 nill이라고 쓰자
-- 
insert into dept_temp(deptno, dname, loc)
values (80, 'mobile', '');

select * from dept_temp;

-- 컬럼을 생략하면 자동으로 null이 들어간다
insert into dept_temp(deptno, loc)
values (90, '인천');

select * from dept_temp where loc is null;

create table emp_temp
as select * from emp;

select * from emp_temp;

insert into emp_temp(empno, ename, job, mgr, hiredate, sal, comm,deptno)
values(9999, '홍길동', 'PRESIDENT', null, '2001/01/01', 5000, 1000, 10);

select * from emp_temp;

insert into emp_temp(empno, ename, job, mgr, hiredate, sal, comm,deptno)
values(1111, '성춘향', 'MANAGER', 9999, '2001-01-05', 4000, null, 20);

select * from emp_temp;

insert into emp_temp(empno, ename, job, mgr, hiredate, sal, comm,deptno)
values(2111, '이순신', 'MANAGER', 9999, to_date( '07/01/2001', 'dd/mm/yyyy'),
4000, null, 20);

select * from emp_temp;

insert into emp_temp(empno, ename, job, mgr, hiredate, sal, comm,deptno)
values(3111, '심청이', 'MANAGER', 9999, sysdate, 4000, null, 30);

select * from emp_temp;

-- p.275 실습 14가 정석
-- 모든걸 모든거에 넣어서 컬럼명은 생략가능
insert into emp_temp
select * from emp where deptno =10;

select * from emp_temp;

create table dept_temp2
as select * from dept;

select * from dept_temp2;

-- 업데이트
-- 지정된 컬럼 모두 바꾸기
update dept_temp2
set loc = 'seoul';

select *from dept_temp2;

-- rollback : 수정 전으로 돌려주는 것
rollback;

-- 테이블 일부만 수정
update dept_temp2
set dname = 'DATABASE',
loc = 'seoul'
where deptno = 40;

select * from dept_temp2;

-- update 순서
-- update 하기 전에 select로 where 조건이 정확한디 확인 후에
-- where를 그대로 복사해서 update에 붙여넣도록 하자
select * from dept_temp2 
where deptno = 40; -- 1번 select ~ where ~;, 한 다음 update문을 사용

create table emp_temp2
as select * from emp;

select * from emp_temp2;

select * from emp_temp2
where job = 'MANAGER';

-- delete : where절을 이용해야함
-- 데이터 지우기
delete emp_temp2
where job = 'MANAGER';

-- 실습
-- emp_temp2에서
-- 급여가 1000이하인 사원의
-- 급여를 3% 인상
select * from emp_temp2
where sal <= 1000;

select ename sal, sal*1.03 from emp_temp2
where sal <= 1000;

update emp_temp2
set sal = sal * 1.03
where sal <= 1000;

select * from emp_temp2;

delete emp_temp2;

select * from emp_temp2;

rollback;
select * from emp_temp2;

                -- 11장
-- 책보기
                    -- 12장 
desc emp;
select * from salgrade;

create table emp_ddl(
    empno number(4),  -- 0 ~ 9999까지만 들어갈 수 있다 , number를 쓴 이유는 숫자만 받겠다
                      -- empno에 varchar2 도 쓸 수 있다(문자 숫자 다 들어옴)
    ename varchar2(10),-- varchar는 문자를 뜻하고 10은 10바이트만 들어갈 수 있다는 뜻
    job varchar2(9), -- vatchar2 : 제한보다 적은 글씨가 적힌 글씨 만큼의 공간
    mgr number(4),
    hiredate date,
    sal number(7,2), -- 앞에 7은 숫자 길이 2는 소수점 둘째자리까지 기록할 수 있다
    comm number(7,2),
    deptno number(2)
);

select * from emp_ddl;
desc emp_ddl;

-- 복사문
create table dept_ddl -- dept_ddl은 원본이 없음, 새로운 테이블을 만들어줌 
 as select * from dept; -- 먼저 실행 후 위에 새로 만든 테이블에 넣은 후 실행됨
-- 출력문 비슷함
select * from dept_ddl; -- 

create table emp_ddl_30
as select empno,ename, sal from emp where deptno =30;

select * from emp_ddl_30;

select * from emp
where 1 <> 1;



create table emp_alter
as select * from emp; -- 실행을 꼭 해줘야 아래 select가 실행됨

select * from emp_alter;
-- 테이블을 수정하고 컬럼을 추가함
-- add했을 경우 지정을 안해주면 null이 들어감
alter table emp_alter
add hp varchar(20);

select * from emp_alter; 
-- rename to : 컬럼의 이름을 바꾸는 방법
alter table emp_alter 
rename column hp to tel;

select * from emp_alter;

-- modify : 열(타입)을 변경하는 방법
alter table emp_alter
modify empno number(5);

desc emp_alter;

-- 크키가 커지는건 가능하지만 줄어드는 것은 불가능함
alter table emp_alter
modify empno number(4); 

-- drop column : 특정 열(타입)을 삭제하는 방법
alter table emp_alter
drop column tel;

select * from emp_alter;
-- 삭제 후 추가하면 새로운 컬럼을 주는 것이여서 
-- 그 전 데이터는 없어져서 null로 표시됨
alter table emp_alter
drop column comm;

select * from emp_alter;

-- rename 테이블 이름 바꾸는 방법
rename emp_alter to emp_rename;

select * from emp_rename;
-- 데이터를 삭제 (컬럼명만 남기고 내용은 다 지워짐)
truncate table emp_rename;

-- drop table : 테이블을 삭제
drop table emp_rename;

create table emp_hw
empno number(4),
ename varchar2(10),
job varchar2(9),
                    -- 13장
select * from dict;
select * from user_tables;

select * from USER_CONSTRAINTS;

-- index 색인
-- 오름차순, 내림차순 따로 관리
create index idx_emp_sal
on emp( sal );
select * from user_indexes;

drop index idx_emp_sal;

create index idx_emp_sal
on emp( sal );

select * from emp
order by sal;

-- plan
-- sql developer에서는 상단 세번째 아이콘 "계획설명"

select max(empno)+1 from emp_temp2; 

insert into emp_temp2 (empno, ename)
values (select max(empno)+1 from emp_temp2),
'신입이2');
select * from emp_temp2;

create table tb_user(
    user_id number,
    user_name varchar2(30)
);
select * from tb_user;

create sequence seq_user;

select seq_user.nextval from dual;
select seq_user.currval from dual;

insert into tb_user (user_id, user_name)
values (seq_user.nextval, '유저명1');
insert into tb_user (user_id, user_name)
values (seq_user.nextval, '유저명2');
insert into tb_user (user_id, user_name)
values (seq_user.nextval, '유저명3');
select * from tb_user;