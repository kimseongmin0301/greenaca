-- 총직원수
SELECT 	LOC,
		count(*) AS '총 직원 수' 
FROM EMP 
JOIN dept 
ON EMP.DEPTNO = DEPT.DEPTNO 
WHERE LOC = 'CHICAGO';

-- 총직원수, 총 급여금액
SELECT 	DEPTNO,
		COUNT(*) AS '총 직원 수', 
		SUM(SAL) AS '총 급여 금액', 
		AVG(SAL) AS '급여 평균',
        MAX(SAL) AS '최대 급여',
        MIN(SAL) AS '최저 급여'
FROM EMP
group by DEPTNO
HAVING AVG(SAL) <= 2500;

-- 각 부서별로 지급되는 총 월급
SELECT 	DEPTNO,
		SUM(SAL) AS '총 월급'
FROM EMP
GROUP BY DEPTNO;

-- 각 직업별로 월급이 제일 많은 사람과 제일 적은 사람의 차이는?
SELECT 	JOB,
		MAX(SAL) - MIN(SAL) AS '급여 차이'
FROM EMP
GROUP BY JOB;

-- 커미션이 없는 사람 중에 각 부서별로 월급이 제일 작은 사람은?
SELECT  DEPTNO,
		MIN(SAL),
        ENAME
FROM EMP
WHERE SAL IN(SELECT MIN(SAL) FROM EMP WHERE COMM IS NULL OR COMM = 0 GROUP BY DEPTNO)
GROUP BY DEPTNO;

-- 급여가 3000대인 회원의 사원번호, 성명, 일하는 지역을 검색
SELECT EMPNO, ENAME, LOC
FROM EMP 	E
JOIN DEPT   D
ON E.DEPTNO = D.DEPTNO
WHERE SAL BETWEEN 3000 AND 3999;

-- 성명에 LA가 포함된 회원의 성명, 부서명, 일하는 지역을 검색
SELECT ENAME, DNAME, LOC
FROM EMP AS E
JOIN DEPT   D
ON E.DEPTNO = D.DEPTNO
WHERE ENAME LIKE '%LA%';