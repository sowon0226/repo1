-- 한줄 주석
/* 범위 주석*/
select 
    * -- 모든 컬럼을 뜻함
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
-- 내림차순 : desc
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

-- in과 or가 동일하다는 말
select* from emp
where job in ('MANAGER', 'SALESMAN', 'CLERK');
-- in 앞에 not을 붙일 수 있음
select* from emp
where job not in ('MANAGER', 'SALESMAN', 'CLERK');


