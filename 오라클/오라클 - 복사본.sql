-- ���� �ּ�
/* ���� �ּ�*/
select 
    * -- ��� �÷��� ����
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
-- �������� : desc
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

-- in�� or�� �����ϴٴ� ��
select* from emp
where job in ('MANAGER', 'SALESMAN', 'CLERK');
-- in �տ� not�� ���� �� ����
select* from emp
where job not in ('MANAGER', 'SALESMAN', 'CLERK');


