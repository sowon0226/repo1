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
    substr(job, (length(job)+1) / 2, 1),
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

-- 실습 문제 4
-- 두번째 글씨만 *
-- WARD -> W*RD, MARTIN -> M*RTIN

-- 실습 문제 5 
-- 가운데 글씨만 *
-- WARTIN -> W*RTIN, SCOTT -> SC*TT