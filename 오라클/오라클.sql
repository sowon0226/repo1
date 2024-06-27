-- ���� �ּ�
/* ���� �ּ�*/
select 
    * -- ��� �÷��� ���� , �� �ȿ��� �ݺ��� �ȴ�?
from 
   emp; -- ; ���� ������ ���� �����/ (emp�� ���̺� ��) �����̶�� ��
   -- select�� from�� �׻� ���� �ٴ�
   -- from ������ ���̺� ���� ��
 select 
    empno, ename, deptno
from 
   emp;  
-- ��� �÷�(��)
FROM
    emp; -- ;�� ;���̸� ��������ش�
-- sql developer �ڵ� ���� ����Ű : ctrl + F7
SELECT
    empno,  -- ��ȸ�ϰ� ���� �÷� ���
    ename,
    deptno
FROM
    emp;

select * from dept;
select * from salgrade;

select deptno from emp;
-- ���� ���� ����Ű : Ctrl + shift + d

-- distinct : select���� �ߺ��Ǵ� �ڷḦ �������ش�
select distinct deptno from emp;
-- �÷��� �������� ��� �÷����� ������ �ߺ��Ǵ°� �������ش�
select distinct job from emp;

select distinct deptno, job from emp; --distinct�� �ΰ��� �÷����� �ߺ��� ���� ������

-- null�� �����ϸ� ������ null�� ���´�
select ename, sal, sal*12+comm, comm from emp;
-- �÷��� ��Ī ���
-- " ���� ����
-- as ���� ����
-- ��Ī �ȿ� ���Ⱑ �ִ� ��� " ���� �Ұ�
-- �����ϸ� ���� ����  _�� ����
select ename, sal, sal*12+comm as new_sal, comm from emp; 


-- order by : �ش� �÷����� �������� (�������� ���������� ������)
-- �������� : asc ��������
-- �������� : desc ���ĸ�
-- ������ ���� ū ������� �������� (�����͸� ������� ���� �� �� ���)
select * from emp
order by sal asc;

-- null�� ������ ������(null�� ������ �ȵǾ�����)
select * from emp
order by comm;
-- ū�ͺ��� ���� ������� ����
select * from emp
order by sal desc;

-- order by ù��°�ŷ� �����ϰ�
-- �� �߿� ������ �ִٸ� �����ŷ� �����ϰ�
-- �� �߿� ������ �ִٸ� �����ŷ� �����ϰ�
select * from emp
order by deptno asc, sal desc;
-- p92 ���� 2��
select distinct job from emp
order by job; -- ���ĺ� ����

-- where : �ʿ��� �����͸� ����ϴ� ���
-- deptno�� 30�� �͸� ���
select * from emp
where deptno = 30;
-- p.95 1�� ����
select * from emp
where empno = 7782;

-- 2000���� ũ�ų� ���ٸ� ǥ�� �� ��
select * from emp
where sal >= 2000
order by sal;

-- king�� ���� ��
select * from emp
where ename = 'KING';

select * from emp 
where deptno = 30 and job = 'SALESMAN'

select * from emp 
where job = 'CLERK' and deptno = 30,
-- ������ �� 
select * from emp 
where job = 'CLERK' and deptno = 30 or deptno = 20;
-- clerk�� 20 �Ǵ� 30�� ��
-- and �� ���� ����ǹǷ� ()�� �������
select * from emp 
where job = 'CLERK' and (deptno = 30 or deptno = 20);
-- 2000 ���� ũ�� 3000 ���� ���� ��
select * from emp
where sal >= 2000 and sal < 3000;

-- �����ʴ� !=, <>, ^=
select * from emp
--where sal != 3000;
where sal <> 3000; -- ���� �ʴٴ� ǥ��

-- not
select * from emp
where not (sal >= 2000 and sal < 3000);

select * from emp
where job in ('MANAGER', 'SALESMAN', 'CLERK');

-- in�� or�� �����ϴٴ� ��
select * from emp
where job in = 'MANAGER'or job = 'SALESMAN'or job 'CLERK';
-- in �տ� not�� ���� �� ����
select * from emp
where job not in ('MANAGER', 'SALESMAN', 'CLERK');

select * from emp
where sal >= 2000 and sal <= 3000;
-- >=, <= ��ȣ ��ſ� between A(�ּڰ�) and B(�ִ�)�� ����
select * from emp
where sal between 2000 and 3000;

select * from emp
where sal not between 2000 and 3000;

-- like : ������ ã�� �� ����
-- ��) 'S%' %���ϵ� ī��� Ư�� ���� �Ǵ� ���ڸ� ã�� �� ���
-- % ��ŵ� ������� (������ ���̿� ����� ����)
-- S�� �����ϴ� ������ ã�� ��
-- like�� ��� �� index�� ��� �� �� ����
select * from emp
where ename like 'S%';
-- like�� �ƴϴ� ��� ǥ���ϰ� ���� �� like �տ� not�� ���̸� ��
select * from emp
where ename like 'A%';
-- '_L%' �϶��� �̸��� �ι�° �ڸ��� A�� ���� �̸��� ã��
select * from emp
where ename like '_L%';
-- _�� �� �ѱ����ε� � ���ڵ� ������� 
select * from emp
where ename like '____%';
-- %AM%�� ���� ���̿� ������� �̸��� AM�� �� ���� ã�� ��
select * from emp
where ename like '%AM%';
-- ������ ���� 400�� ������ �Ǵ��� Ȯ�� �� ����ϱ�
-- null�� �񱳰� �ȵ� �׷��� null�� ����
-- null�� ������ �ȵ�
select * from emp
where comm <= 400;
-- \ �ڿ� ���� ���� ������ ���ڷ� �˷���?

select * from emp
where comm = null; --�� ����� �ȵ�
-- null�� ������ �ȵǹǷ� is null�� ����ؾ���
-- not�� ��� �ϰ� ���� ���� is no null�� ����ؾ���
select * from emp
where comm is null;
-- 0�� null�� �ƴ� 0�� �׳� 0��
select * from emp
where comm is not null;
-- and, or�� true���� false���� Ȯ���� �� ���
select * from emp
where sal > null and comm is  null;

select * from emp
where sal > null or comm is  null;

-- emp���� deptno�� 10 �Ǵ� 20�� �����
-- empno, ename, sal, deptno���� ���
select empno, ename, sal, deptno from emp
-- where deptno = 100 or deptno = 20;
where deptno in (10, 20);
-- Ÿ���� ���� �� union�� ���ָ� ������
-- ���� �ٸ� ��ȸ �����(���̺�)�� �����ش�
-- ��, ��ȸ�� �÷��� ����, Ÿ���� ���ƾ���
-- ��) empno, ename, sal, deptno - empno, deptno, ename, sal
-- �÷� Ÿ���� ������ �ٲ��  ����� �ȵ�
-- union : �ߺ��� �ڷḦ �������ش�
select empno, ename, sal, deptno from emp
where deptno = 10
union -- ���� ���� �� �ߺ��� �ڷḦ ���� �� ������
select empno, ename, sal, deptno from emp
where deptno = 10;
-- union all : �ߺ��� ������� �����ش� (�ǹ������� union all�� ���)
select empno, ename, sal, deptno from emp
where deptno = 10
union all -- ���� ���� �� �ߺ��� �ڷ� ������� ��� ������
select empno, ename, sal, deptno from emp
where deptno = 10;

-- minus, intersect�� ����Ŭ������ ��밡��
-- p.125
-- Q1
select * from emp
where ename like '____S%'; -- ename like '%S';���� ��� ����
-- Q2
select empno, ename, job, sal, deptno from emp
where job = 'SALESMAN';
-- deptno = 30 and job = 'SALESMAN'���� ��� ����
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
-- not�� �� �� ()�� �Ƚ��ָ� �տ����� ���Ե�
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
-- upper, lower�� ��ҹ��� ���� ���� like�Ҷ� �� ����
-- upper, lower �ٽ� ���庸��
select * from emp
where lower (ename) like lower('%Mi%');

-- length ���� ����(����)
select ename, length(ename) from emp;
select * from emp
where length(ename) >=5;
-- dual : �ӽ� ���̺� 
select length('��'), lengthb('��') from dual;

-- 0���� 1�� ����
-- substr : ����� �Ǵ� ����, ���� ��ġ, ������ ����
-- ������ ������ �Ⱦ��ų� �ʹ� ũ�� ������ 
select job, substr(job, 1, 2), substr(job, 0, 2),
substr(job, 3, 3),
substr(job, 5), 
ename,
substr(job, -3, 2 ),
length( lower ( substr(job, 5, 100) ) )
from emp;

-- job���� A�� *�� �ٲ��
-- replace('���', 'ã�� ���', '�ٲ� ����')
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

-- lpad,rpad ([���ڿ� ������ �Ǵ� ���̸�],[�������� �ڸ���(�ʼ�)],[����� ä�﹮��(����)])
-- lpad : ����� �Ǵ� ����, ��ü �ڸ���, ä�� ����
-- ä�� ���� ������ ���� ����
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
-- ���ڿ� ���ϱ�
select empno || ename || '��'
from emp;

-- trim : �� �� ���� ����
-- �۾� ������ ������ �������� ����
select 
    ' a b c     ',
    trim( ' a b c     ')
from dual;    

-- �ǽ����� 1
select 
    '210621-3123456',
    '210621-3******'
from dual;
-- ù��° ���
select 
    '210621-3' || '******'
from dual;    
-- �ι�°
select 
    substr('210621-3123456', 1, 8) || '******',
    rpad('210621-3', 14, '*'),
    rpad(
      substr('210621-3123456', 1, 8),
      length('210621-3123456'),
      '*'
      )
from dual;

-- �ǽ� ���� 2
-- ����� �̸��� �տ� ���ڸ��� ���̰� �ϰ� �������� *�� ǥ��
-- ������ �� : WARD -> MA** , MARTIN -> MA****
-- ������� : �տ� �� ���� + '***'
select
    lpad(ename, 2),
    rpad(lpad(ename, 2),8 ,'*')
from emp;    

-- �ǽ� ���� 3
-- �� ���� �ϳ��� 
-- WARD -> *ARD , MARTIN -> *ARTIN
select 
    ename,
    lpad(substr(ename, 2), length(ename), '*')
    from emp;
-- �ǽ� ���� 4
-- �ι�° �۾��� *
-- WARD -> W*RD, MARTIN -> M*RTIN
select
    ename,
    substr(ename, 1, 1) || '*'|| substr(ename,3)
    -- lpad�� rpad�θ����� �ȵŴ� ������ ���ڸ� �ڸ� �� �ٿ��ֱ⸦ ��������
    -- || ���ϱ� ǥ�ø� ����ؼ� �ٿ� �����
from emp;    
-- �ǽ� ���� 5 
-- ��� �۾��� *
-- WARTIN -> W*RTIN, SCOTT -> SC*TT
select
    ename,
    substr(ename,1 , length(ename) /2-0.5)|| '*'||
    substr(ename,length(ename)/2+1.5 )
    -- �������� 0.5�� ������
    -- �Ʒ������� ���� 0.5�� �ֿ��ͼ� 1.5�� ������
from emp;

select ename from emp;

-- �����԰� �Բ� Ǯ����
-- �ǽ� ���� 2
-- ����� �̸��� �տ� ���ڸ��� ���̰� �ϰ� �������� *�� ǥ��
-- ������ �� : WARD -> MA** , MARTIN -> MA****
-- ������� : �տ� �� ���� + '***'
select
    -- ����� 2������ ����
    ename,
    rpad( substr( ename, 1, 2),length(ename), '*')
from emp;
-- �ǽ� ���� 3
-- �� ���� �ϳ��� 
-- WARD -> *ARD , MARTIN -> *ARTIN
select '*' || substr(ename,2) from emp;
-- �ǽ� ���� 4
-- �ι�° �۾��� *
-- WARD -> W*RD, MARTIN -> M*RTIN
select substr(ename, 1, 1) || '*' || substr(ename, 3) from emp;
-- �ǽ� ���� 5 
-- ��� �۾��� *
-- WARTIN -> W*RTIN, SCOTT -> SC*TT
select 
    length(ename)/2 + 1,
    substr(ename, 1, length(ename)/2) ||'*'|| substr(ename, length(ename)/2 +2)
from emp;    

-- trunc : �Ҽ����� ���� ����
select
    trunc(1234.5678),
    trunc(1234.5678, 2), -- �Ҽ��� 2��° ���� ����
    trunc(1234.5678, -2), -- �� �ι�° �ڸ����� ����
    trunc(-12.34)
from dual;

-- ceil : .���� ��� �ø� ������ ����� ū ���� ������ ��
-- floor : . ���� ��� ���� ������ ���� ���� ������ ��
select
    ceil (3.14), 
    floor(3.14),
    ceil(-3.14), -- -3�� ���� ���� : -�� �� �ø��� ������ ū ������ ǥ��
    floor(-3.14) -- 
from dual;

-- sysdate : ��¥ �Լ� (+9�ð��� ����� �츮���� �ð���)
-- ���� ����Ŭ pc�� �ð��� ���ɴϴ�
-- ���� pc�� 9�ð� ���̰� ����(���� 0�� ���� �ѱ� +9��)
-- ��¥ ���� �� �Ϻθ� select�� ǥ�õ�
-- ����Ŭ�� ����, ���� ����� ���� ��Ȯ��
select sysdate, sysdate+1, sysdate-1 from dual;

-- add_months : �Ѵ� �ڸ� ����� �� ����ϴ� �ڵ�
-- �÷��� +�� ������ ��� ���ڷ� �����ؼ� ������
-- || ���ڵ� ���ڷ� ����
select -- 9�ð��� ���� �� sysdate+(9/24)�� ǥ����
    to_char (sysdate, 'YYYY"��"/MM"��"/DD"��" HH24"��":MI"��":SS"��"')
from dual;

-- to_number : ?
select -- ���� ��¥ - ���ϴ� ��¥ 
    sysdate - to_date('2024-05-07', 'yyyy-mm-dd'),
    'YYYY"��"/MM"��"/DD"��" HH24"��":MI"��":SS"��"'
from dual;

-- null ó���Լ� ( null �տ� nvl�� �����, nvl�� ����Ŭ�� ��밡��)
-- null�� ���Ѵ뿩�� ���ϵ� ���ϵ� null��
-- �ʿ��� ��� ���ڰ� �� �� �ִ�
select
    comm,
    nvl(comm, -1),
    sal,
    sal + comm,
    sal + nvl(comm, 0) 
from emp;

-- where ���ǿ����� nvl�� ��밡��
-- where ������ ������ ���� ���� �˷���
-- ���� ������ nvl2����
-- '0','X'�� ���ΰ�� 0�� ǥ�� 
select *from emp
where nvl(comm, 0) = 0; -- null�� ��� null�� 0�̰�, ��� ���� 0�� ���Ǹ� ��µ�

-- case�� case �� when,then�� �� ���� (��) if->else if->else����
-- case�� �����ؼ� end�� �ݾ���
-- decode�� ��� case������ �ٲܼ� ������, case���� decode�� �ٲ� �� ����
select
    case 
        when
            comm is null
            then
                'N/A' -- ����
        else
             to_char(comm) -- comm�� ���ڿ��� to_char�� �̿��� ���ڷ� ��ȯ
           -- ''||comm �� �Ʒ� �Ѵ� ��� ����
    end new_comm
from emp;    
-- nvl ����ϴ¹�
-- null ó�� �� �� nvl�� ����ؼ� �ڵ��ϴ¹�
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
-- �����԰� �Բ� Ǭ ���
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
    next_day(add_months(hiredate, 3), 2) as r_job_1, -- �Ͽ�1, ����2,.....���7
    comm,
    nvl(to_char(comm), 'N/A'),
    to_char(null),
    case
    when comm is null then 'N/A'
    else to_char(comm)
    end,
    decode(comm,
    null, 'N/A', -- decode�� to_char�Ƚᵵ �˾Ƽ� ����
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

-- select sum(sal), sal from emp; sal ������ �ȵ�
-- countó�� null�� ���� ��
-- count������ *�� ���� ��
select sum(sal), count(sal),count(*), count(comm) from emp;

select count(*) from emp where ename like '%A%';
-- �տ� max�� �ڿ� max�� ���谡 ����
-- avg ��հ�
select max(sal), max(ename), min(hiredate), min(comm), avg(sal) from emp;

-- �μ��� �޿� �� ��, ��� ǥ��
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

-- distinctó�� �ߺ��� ��������, �з�����
-- select���� group by�� ���̳� ������ �Լ�(�����Լ�)�� �� �� ���� 
select deptno, avg(sal), sum(sal), count(*) from emp
group by deptno; -- from �ڿ� group by�� �� �� �ִ� �� �տ� ������ ����
-- group by�� ,�� �̿��ؼ� ���� �� �ִ�
-- count(*)�� �ߺ��� ���� �˷���
select deptno, empno from emp
group by deptno, empno; 

select deptno, job, count(*)
from emp
group by deptno, job -- select�� �ִ� �͸� group by�� ���� �� �ִ�
order by deptno, job; -- order by�� group by�� �ִ� �͸� ���� �� ����

select deptno, job, count(*)
from emp
-- where count(*)>2 ������
group by deptno, job 
order by deptno, job;

-- having : group by������ ���ȴ�.
-- �����Լ��� �������� �ɰ� ���� ��쿡 ���
-- group by�� ������
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
having count(*) >= 3; -- where �������� �� �� ����, �Ǵٸ� ���̺��� ���� ����

select * from dept;

-- ����
/* 5 */select job, count(*) cnt -- ����� ���� ���� �Ŀ�
/* 1 */from emp 
/* 2 */where sal > 1000 -- count�� ���� ����
/* 3 */group by job
/* 4 */having count(*) >= 3
/* 6 */order by cnt desc; -- ����

-- ����Ŭ�� ���� ���� �ִ� ����Ʈ�� ��� ������
-- ������ �ɸ� ���ϴ� ���Ǹ� ������
select * 
from emp, dept
order by empno;

select 14 * 4 from dual;

-- ���� ���
-- ���̺� �ΰ��̸� ���� ���� ������ ã�ƾ���
select * 
from emp, dept
where emp.deptno = dept.deptno
order by empno;

-- �ּ�ó�� �� ���� ��� �ȵ� ������
select emp.ename, /* emp.loc */ dept.loc, /* deptno */ emp.deptno -- ename�� emp���� ����
from emp, dept
where emp.deptno = dept.deptno -- ���̺��.�÷����� ����
order by empno;
-- ���̺� �ΰ� �̻� ��ȸ�� �� ���踦 �� �˷���� ���ϴ� ������ ��µȴ�
-- ��ü ���̺� �� - 1���� ������ �����ϴ�

-- ��Ī�� ���̸� ���̻� ���� �̸��� ����
select *
from emp e, dept d -- ���⼭�� as�� ����, "/'����
where E.deptno = d. deptno; -- ��ҹ��� �Ѵ� ��� ����
--where emp.deptno = dept. deptno; ��Ī�� �༭ ���� �̸� ���� ����

select e.ename from emp e; -- �ܵ����� ���� ���� ���� ��Ī�� �ٿ���

-- *�� �ٸ� �÷��� ���� ���� ���� �� *�� ���̺��� �����������
-- ��Ī�� �ٿ������
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

-- using�� �Ѵ� ���� �÷����� �ִ� ��츸 �� �� �ִ�
-- emp
select *
from emp join dept using (deptno);

-- �� ���̺��� �ٸ� ��쿡 ���
select *
from emp join dept on (emp.deptno = dept.deptno);

-- king(null)�� �ȳ��� 
select *
from emp e1 join emp e2 on (e1.mgr = e2.empno);

-- king(null)�� ��������
-- left outer join : ���� ���̺��� ��� ������ִ� ���� �������ش�
-- join�� �������� ���� ���̺��� ��� ���
-- ������ ��� null�� ó����
select *
from emp e1 left outer join emp e2 on (e1.mgr = e2.empno);
-- right outer join : �������� ��� ��� ������ ����־ �������
select *
from emp e1 right outer join emp e2 on (e1.mgr = e2.empno);

-- Q1
-- empno, ename, dame, loc ��� : ��� 14��
select empno, ename, dname, loc  
from emp e, dept d 
where E.deptno = d. deptno;
-- ��� 1
select empno, ename, dname, loc 
from emp, dept
where emp.deptno = dept.deptno;
-- ��� 2
select empno, ename, dname, loc 
from emp join dept using (deptno);
-- ��� 3
select empno, ename, dname, loc 
from emp left outer join dept on(emp.deptno = dept.deptno);
-- Q2
-- ���, �̸� �μ���, �޿������ ��� ��� : ��� 14��
-- ���̺� 3��
-- ��� 1
-- salgrade�� ����� ����  e.sal >= losal and e.sal <= hisal �� ���� �������
select e.empno, e.ename, d.dname, s.grade
from emp e, dept d, salgrade s
where e.deptno = d.deptno
and (e.sal >= s.losal and e.sal <= s.hisal);
-- ��� 2
select e.empno, e.ename, d.dname, s.grade
from salgrade s, emp e join dept d using (deptno)
where (e.sal >= s.losal and e.sal <= s.hisal);
-- ��� 3
select e.empno, e.ename, d.dname, s.grade
from emp e
left outer join dept d on (e.deptno = d.deptno)
left outer join salgrade s on (e.sal >= s.losal and e.sal <= s.hisal);

-- Q3
-- �Ŵ��� ���� ������ ���� ����� �̸�, �޿� �Ŵ��� �̸�, �Ŵ��� �޿� ���
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

-- ��������
-- ���ʿ� �ִ� ����
select sal from emp where ename = 'JONES';

select * from emp 
where sal >(select sal from emp where ename = 'JONES');
-- where ������ ������ ������ ��

select *
from emp
where sal > ( select avg(sal) from emp) and deptno = 20;
-- ��� �޿����� ���� �޴� �����
select * from emp
where sal > ( select avg(sal) from emp):
-- BLAKE�� ���� ���� ������ �޴� �����
select * fromemp
where sal > ( select sal from emp where enamw = 'BLAKE');
-- JONES �� ���� job�� ������ �ִ� �����
select * from emp
where job = ( select job from emp where ename = 'JONES');

select * from emp
where sal in(
select max(sal) from emp group by deptno);

select *
from (
    select * from emp where deptno = 10);

-- rownum : �� ��ȣ    
select rownum, emp.*
from emp
--where rownum = 4; -- 1�� �ʱ�ȭ�� �Ǿ� �־ �ȳ��� where���� ����� �ȵ�
order by ename; -- ���� ���� ������ (order by�� �� ���߿� �����)

select rownum , e.*
from (
    select * from emp order by ename) e;

select job, count(*) from emp
group by job
having count(*) >= 3;

select *
from ( select job, count(*) cnt from emp
       group by job)
where cnt >= 3; -- cnt��Ī�� �ٿ��ְ� ���, having�� �Ⱦ��� ���� ���

-- wuth�� ������ select �տ� ����� ���� ��
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
-- �ϴ� ��ü����� ��� �޿��� ��ȸ
select avg(sal) from emp;
select empno, ename, sal from emp, dept, salgrade
where sal > (select avg(sal) from emp);

-- �ϴ� ��ü����� ��� �޿��� ��ȸ
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
                    -- 10��
create table dept_temp
as select * from dept;

select * from dept_temp;

-- ���̺� �����͸� �߰�(�� �߰�)
insert into dept_temp(deptno, dname, loc)
                values(50, 'DATABASE', 'SEOUL');
                
select * from dept_temp;         

insert into dept_temp
values (60, 'network', 'Busan');

select * from dept_temp;
-- ���̺�� �ڿ� ()�����ϸ� ��� �÷� ����
insert int dept_temp
values ('network', 60, 'Busan');

insert into dept_temp(deptno, dname, loc)
values (70, '��', null);

select * from dept_temp;

-- ''�� null�� ���̴µ� �׷��� nill�̶�� ����
-- 
insert into dept_temp(deptno, dname, loc)
values (80, 'mobile', '');

select * from dept_temp;

-- �÷��� �����ϸ� �ڵ����� null�� ����
insert into dept_temp(deptno, loc)
values (90, '��õ');

select * from dept_temp where loc is null;

create table emp_temp
as select * from emp;

select * from emp_temp;

insert into emp_temp(empno, ename, job, mgr, hiredate, sal, comm,deptno)
values(9999, 'ȫ�浿', 'PRESIDENT', null, '2001/01/01', 5000, 1000, 10);

select * from emp_temp;

insert into emp_temp(empno, ename, job, mgr, hiredate, sal, comm,deptno)
values(1111, '������', 'MANAGER', 9999, '2001-01-05', 4000, null, 20);

select * from emp_temp;

insert into emp_temp(empno, ename, job, mgr, hiredate, sal, comm,deptno)
values(2111, '�̼���', 'MANAGER', 9999, to_date( '07/01/2001', 'dd/mm/yyyy'),
4000, null, 20);

select * from emp_temp;

insert into emp_temp(empno, ename, job, mgr, hiredate, sal, comm,deptno)
values(3111, '��û��', 'MANAGER', 9999, sysdate, 4000, null, 30);

select * from emp_temp;

-- p.275 �ǽ� 14�� ����
-- ���� ���ſ� �־ �÷����� ��������
insert into emp_temp
select * from emp where deptno =10;

select * from emp_temp;

create table dept_temp2
as select * from dept;

select * from dept_temp2;

-- ������Ʈ
-- ������ �÷� ��� �ٲٱ�
update dept_temp2
set loc = 'seoul';

select *from dept_temp2;

-- rollback : ���� ������ �����ִ� ��
rollback;

-- ���̺� �Ϻθ� ����
update dept_temp2
set dname = 'DATABASE',
loc = 'seoul'
where deptno = 40;

select * from dept_temp2;

-- update ����
-- update �ϱ� ���� select�� where ������ ��Ȯ�ѵ� Ȯ�� �Ŀ�
-- where�� �״�� �����ؼ� update�� �ٿ��ֵ��� ����
select * from dept_temp2 
where deptno = 40; -- 1�� select ~ where ~;, �� ���� update���� ���

create table emp_temp2
as select * from emp;

select * from emp_temp2;

select * from emp_temp2
where job = 'MANAGER';

-- delete : where���� �̿��ؾ���
-- ������ �����
delete emp_temp2
where job = 'MANAGER';

-- �ǽ�
-- emp_temp2����
-- �޿��� 1000������ �����
-- �޿��� 3% �λ�
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

                -- 11��
-- å����
                    -- 12�� 
desc emp;
select * from salgrade;

create table emp_ddl(
    empno number(4),  -- 0 ~ 9999������ �� �� �ִ� , number�� �� ������ ���ڸ� �ްڴ�
                      -- empno�� varchar2 �� �� �� �ִ�(���� ���� �� ����)
    ename varchar2(10),-- varchar�� ���ڸ� ���ϰ� 10�� 10����Ʈ�� �� �� �ִٴ� ��
    job varchar2(9), -- vatchar2 : ���Ѻ��� ���� �۾��� ���� �۾� ��ŭ�� ����
    mgr number(4),
    hiredate date,
    sal number(7,2), -- �տ� 7�� ���� ���� 2�� �Ҽ��� ��°�ڸ����� ����� �� �ִ�
    comm number(7,2),
    deptno number(2)
);

select * from emp_ddl;
desc emp_ddl;

-- ���繮
create table dept_ddl -- dept_ddl�� ������ ����, ���ο� ���̺��� ������� 
 as select * from dept; -- ���� ���� �� ���� ���� ���� ���̺� ���� �� �����
-- ��¹� �����
select * from dept_ddl; -- 

create table emp_ddl_30
as select empno,ename, sal from emp where deptno =30;

select * from emp_ddl_30;

select * from emp
where 1 <> 1;



create table emp_alter
as select * from emp; -- ������ �� ����� �Ʒ� select�� �����

select * from emp_alter;
-- ���̺��� �����ϰ� �÷��� �߰���
-- add���� ��� ������ �����ָ� null�� ��
alter table emp_alter
add hp varchar(20);

select * from emp_alter; 
-- rename to : �÷��� �̸��� �ٲٴ� ���
alter table emp_alter 
rename column hp to tel;

select * from emp_alter;

-- modify : ��(Ÿ��)�� �����ϴ� ���
alter table emp_alter
modify empno number(5);

desc emp_alter;

-- ũŰ�� Ŀ���°� ���������� �پ��� ���� �Ұ�����
alter table emp_alter
modify empno number(4); 

-- drop column : Ư�� ��(Ÿ��)�� �����ϴ� ���
alter table emp_alter
drop column tel;

select * from emp_alter;
-- ���� �� �߰��ϸ� ���ο� �÷��� �ִ� ���̿��� 
-- �� �� �����ʹ� �������� null�� ǥ�õ�
alter table emp_alter
drop column comm;

select * from emp_alter;

-- rename ���̺� �̸� �ٲٴ� ���
rename emp_alter to emp_rename;

select * from emp_rename;
-- �����͸� ���� (�÷��� ����� ������ �� ������)
truncate table emp_rename;

-- drop table : ���̺��� ����
drop table emp_rename;

create table emp_hw
empno number(4),
ename varchar2(10),
job varchar2(9),
                    -- 13��
select * from dict;
select * from user_tables;

select * from USER_CONSTRAINTS;

-- index ����
-- ��������, �������� ���� ����
create index idx_emp_sal
on emp( sal );
select * from user_indexes;

drop index idx_emp_sal;

create index idx_emp_sal
on emp( sal );

select * from emp
order by sal;

-- plan
-- sql developer������ ��� ����° ������ "��ȹ����"

select max(empno)+1 from emp_temp2; 

insert into emp_temp2 (empno, ename)
values (select max(empno)+1 from emp_temp2),
'������2');
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
values (seq_user.nextval, '������1');
insert into tb_user (user_id, user_name)
values (seq_user.nextval, '������2');
insert into tb_user (user_id, user_name)
values (seq_user.nextval, '������3');
select * from tb_user;