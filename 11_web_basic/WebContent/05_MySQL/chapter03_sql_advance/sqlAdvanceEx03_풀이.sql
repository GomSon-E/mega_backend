# 사원번호 , 부서번호 , 근무 부서 이름을 가져오기. (DEPT_EMP , DEPARTMENTS)
SELECT
		DE.EMP_NO,
        D.DEPT_NO,
        D.DEPT_NAME
FROM
		DEPT_EMP DE
        JOIN DEPARTMENTS D
        ON DE.DEPT_NO = D.DEPT_NO;


# 사원번호 , 이름(first,last) , 직함을 조회하기. (EMPLOYEES , TITLES)
SELECT
		E.EMP_NO,
        E.FIRST_NAME,
        E.LAST_NAME,
        T.TITLE
FROM
		EMPLOYEES E
        JOIN TITLES T
        ON E.EMP_NO = T.EMP_NO;
    
    
# 사원번호 , 이름(first_name,last_name) , 부서번호 , 부서이름을 조회하기. (EMPLOYEES , DEPT_EMP , DEPARTMENTS)
SELECT 
		E.EMP_NO,
        E.FIRST_NAME,
        E.LAST_NAME,
        DE.DEPT_NO,
        D.DEPT_NAME
FROM
		DEPT_EMP DE
        JOIN EMPLOYEES E
        ON DE.EMP_NO = E.EMP_NO
        JOIN DEPARTMENTS D
        ON DE.DEPT_NO = D.DEPT_NO;
			   

# 사원번호 , 이름(first,last) , 부서 번호를 조회하기. (EMPLOYEES , DEPT_EMP)
SELECT 
		E.EMP_NO,
        E.FIRST_NAME,
        E.LAST_NAME,
        DE.DEPT_NO
FROM
		DEPT_EMP DE
        JOIN EMPLOYEES E
        ON DE.EMP_NO = E.EMP_NO;

# 사원번호 , 이름(first,last) , 부서 이름을 조회하기. (EMPLOYEES , DEPT_EMP , DEPARTMENTS)
SELECT 
		E.EMP_NO,
        E.FIRST_NAME,
        E.LAST_NAME,
        D.DEPT_NAME
FROM
		DEPT_EMP DE
        JOIN EMPLOYEES E
        ON DE.EMP_NO = E.EMP_NO
        JOIN DEPARTMENTS D
        ON DE.DEPT_NO = D.DEPT_NO;       
      
      
# 부서별로 그룹화하여 부서이름 , 부서번호 , 부서별 직원수를 조회하고 직원수가 많은 곳부터 조회하기. (DEPT_EMP , DEPARTMENTS)
SELECT
		D.DEPT_NAME,
        D.DEPT_NO,
        COUNT(*) AS CNT
FROM 
		DEPARTMENTS D
        JOIN DEPT_EMP DE
        ON D.DEPT_NO = DE.DEPT_NO
GROUP BY
		D.DEPT_NO
ORDER BY
		CNT DESC;

		
# 부서별로 그룹화하고 성별로 그룹화하여 부서이름 , 성별 , 직원 수를 조회하기. (DEPT_EMP , DEPARTMENTS , EMPLOYEES)
SELECT 
		D.DEPT_NAME,
        E.GENDER,
        COUNT(*) AS CNT
FROM 
		DEPT_EMP DE
        JOIN DEPARTMENTS D
        ON DE.DEPT_NO = D.DEPT_NO
        JOIN EMPLOYEES E
        ON DE.EMP_NO = E.EMP_NO
GROUP BY
		D.DEPT_NO,
        E.GENDER;
		
		
# 부서이름 별로 급여의 평균을 구하기 (EMPLOYEES , DEPARTMENTS , DEPT_EMP , SALARIES)
SELECT 
		AVG(S.SALARY)
FROM 
		DEPT_EMP DE
        JOIN DEPARTMENTS D
        ON DE.DEPT_NO = D.DEPT_NO
        JOIN EMPLOYEES E
        ON DE.EMP_NO = E.EMP_NO
        JOIN SALARIES S
        ON E.EMP_NO = S.EMP_NO
GROUP BY 
		D.DEPT_NAME;

		
# 직함별로 급여의 평균을 구하기 (TITLES , SALARIES)
SELECT 
		AVG(S.SALARY) AS AVG
FROM 	
		SALARIES S
        JOIN TITLES T
		ON S.EMP_NO = T.EMP_NO
GROUP BY
		T.TITLE;
		
		
# 관리자의 부서번호 , 사원번호 , 이름 조회하기 (DEPT_MANAGER ,  EMPLOYEES) 
SELECT
		DM.DEPT_NO,
        DM.EMP_NO,
        CONCAT(E.FIRST_NAME, ' ', E.LAST_NAME) AS FULL_NAME
FROM
		EMPLOYEES E
        JOIN DEPT_MANAGER DM
        ON E.EMP_NO = DM.EMP_NO;
		
				  
# 관리자의 부서번호 , 부서이름 , 사원번호 , 이름 조회하기 (부서이름을a~z로 정렬) (DEPT_MANAGER , EMPLOYEES , DEPARTMENTS)
SELECT
		DM.DEPT_NO,
        DM.EMP_NO,
        D.DEPT_NAME,
        CONCAT(E.FIRST_NAME, ' ', E.LAST_NAME) AS FULL_NAME
FROM
		EMPLOYEES E
        JOIN DEPT_MANAGER DM
        ON E.EMP_NO = DM.EMP_NO
        JOIN DEPARTMENTS D
        ON DM.DEPT_NO = D.DEPT_NO
ORDER BY
		D.DEPT_NAME;
		
		              
# 부서관리자별로 급여의 평균을 구하기 (DEPT_MANAGER , SALARIES)
SELECT 
		AVG(S.SALARY) AS AVG
FROM 	
		SALARIES S
        JOIN DEPT_MANAGER DM
		ON S.EMP_NO = DM.EMP_NO
GROUP BY
		DM.EMP_NO;
		

# 부서별로 그룹화하고 직책별로 그룹화하여 부서이름과 직원수를 조회하기 (TITLES , EMPLOYEES , DEPT_EMP , DEPARTMENTS)
SELECT
		D.DEPT_NAME,
        COUNT(*)
FROM 
		DEPT_EMP DE
		JOIN TITLES T
        ON T.EMP_NO = DE.EMP_NO
        JOIN DEPARTMENTS D
        ON DE.DEPT_NO = D.DEPT_NO
GROUP BY
		D.DEPT_NO,
        T.TITLE;
		
		
# 직책별로 그룹화하고 부서별로 그룹화하여 부서이름과 직원수를 조회하기 (TITLES , EMPLOYEES , DEPT_EMP , DEPARTMENTS)
SELECT
		D.DEPT_NAME,
        COUNT(*)
FROM 
		DEPT_EMP DE
		JOIN TITLES T
        ON T.EMP_NO = DE.EMP_NO
        JOIN DEPARTMENTS D
        ON DE.DEPT_NO = D.DEPT_NO
GROUP BY
		T.TITLE,
        D.DEPT_NO;
