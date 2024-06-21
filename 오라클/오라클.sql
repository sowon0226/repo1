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
    substr(job, (length(job)+1) / 2, 1),
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

-- �ǽ� ���� 4
-- �ι�° �۾��� *
-- WARD -> W*RD, MARTIN -> M*RTIN

-- �ǽ� ���� 5 
-- ��� �۾��� *
-- WARTIN -> W*RTIN, SCOTT -> SC*TT