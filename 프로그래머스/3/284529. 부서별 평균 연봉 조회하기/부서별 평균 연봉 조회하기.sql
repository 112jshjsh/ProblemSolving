SELECT A.DEPT_ID, DEPT_NAME_EN, ROUND(AVG(B.SAL)) AVG_SAL
FROM HR_DEPARTMENT A JOIN HR_EMPLOYEES B
WHERE A.DEPT_ID = B.DEPT_ID
GROUP BY B.DEPT_ID
ORDER BY AVG_SAL DESC