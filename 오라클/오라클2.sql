
-- ����Ŭ ������ ����� ���� ��ȸ --
select level, empno, lpad(' ',2,level) || ename, mgr from emp
start with mgr is null -- ������
connect by prior empno = mgr
order siblings by empno desc;

-- �������� ������ ����� ���� ��ȸ--
with emp_recu(lv,empno, ename, mgr) as (
    select 
        1 as lv,
        empno, ename, mgr
    from emp  -- ��� ���̺�
    where mgr is null --����
    
    union all
    
    
    select
        er.lv + 1 as lv,
    
        e.empno, lpad(' ',2*er.lv) || e.ename, e.mgr 
    from emp_recu er
    left outer join emp e on er.empno = e.mgr 
    where e.mgr is not null -- ������ �����ϴ� ����
    )
search depth first by empno desc set sort_empno_desc -- ���Ŀ� ���� ���� �� ��Ī
select * from emp_recu
order by sort_empno_desc; -- ���� ��Ī�� Ȱ��

-- ����¡�� �ϱ� ���ؼ�
-- �� �������� ��� ���� �ִ°�?
-- ���� �� ������ �ΰ�?

-- ����¡
select 
    rownum, empno, ename
from emp
where rownum < 5 -- �쿬��
order by empno desc;

-- �̸� ()�� ���� �� where ���� �� select�� ����
-- �ѹ��� 3���� �����ִµ� 2��° ���������� 4,5,6�� ���̴°�
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













-- ����
select rownum, empno, ename
from (
    select empno ename
    from emp
    order by ename 
)
where rownum >= 4 and rownum <= 6;