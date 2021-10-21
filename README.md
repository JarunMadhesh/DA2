# Job Recommendation 
## CSE-2049 Context aware computing - Digital Assignment-2 

### Problem statement:

1.	A university is arranging the campus interview for their students:  <br>
They have knowledge system which will display company details for every student based on their skill set, interest, future plan, and requirement. 
The system  maintains  all student details  and company details like domain, pay, internship provided or not, probation period, annual increment etc. <br>
( you can add the required property to  each entity of this scenario ) <br> <br>
 Design the system which displays the filtered company name for every student. <br>
•	Some students  may be in need internship and placement<br>
•	Some students look for  the  growing company<br>
•	Some students look for industry experience for minimum period and the go for higher studies<br>
•	Some students look for the minimum probation period<br>
•	Some students look for specific domain based company<br>
<br>
<br>


## Explanation
Input files: students profiles and the job details are given in the json files in <br>
job-recommendation/src/main/java/com/da2/jsonFiles/students.json<br>
job-recommendation/src/main/java/com/da2/jsonFiles/companies.json

<br>
Each student is given in such a way to satisfy the context types given in the problem statement.<br>
Program output has the context given in the problem statement, student profile and the recommended jobs.<br>
<br>

I have commented in the code for further explanation.
<br>
<br>

## Output of the program
1. Some students  may be in need internship and placement<br>
Profile overview of Aravind<br>
	SkillSet(s): [deep_learning]<br>
	Interest(s): [deep_learning, blockchain]<br>
	Looking for: [placement, internship] in big_companies<br>
<br>
Recommendation #1<br>
	HCL, founded in 1976, provides placement in deep_learning at Rs.2000000 LPA <br>
	Has a probation period of 2 months and salary increase of Rs.20000 every year.<br>
Recommendation #2<br>
	Vivo, founded in 2009, provides internship in deep_learning at Rs.10000 LPA <br>

<br>
2. Some students look for  the  growing company<br>
Profile overview of Abhishek<br>
	SkillSet(s): [Android_development]<br>
	Interest(s): [Android_development, ios_development]<br>
	Looking for: [internship] in startups<br>
<br>
Recommendation #1<br>
	Zerodha, founded in 2019, provides internship in Android_development at Rs.10000 LPA <br>
<br>

3. Some students look for industry experience for minimum period and the go for higher studies<br>
Profile overview of Jarun<br>
	SkillSet(s): [deep_learning, Android_development]<br>
	Interest(s): [deep_learning, Android_development, machine_learning]<br>
	Looking for: [internship, higherStudies] in big_companies<br>
<br>
Recommendation #1<br>
	Microsoft, founded in 1975, provides internship in Android_development at Rs.30000 LPA <br>
Recommendation #2<br>
	Vivo, founded in 2009, provides internship in deep_learning at Rs.10000 LPA <br>
Recommendation #3<br>
	Zerodha, founded in 2019, provides internship in Android_development at Rs.10000 LPA <br>

<br>
4. Some students look for the minimum probation period<br>
Profile overview of Roshan<br>
	SkillSet(s): [website_development]<br>
	Interest(s): [website_development, Android_development]<br>
	Looking for: [placement] in big_companies<br>
<br>
Recommendation #1<br>
	HCL, founded in 1976, provides placement in Android_development at Rs.1000000 LPA <br>
	Has a probation period of 3 months and salary increase of Rs.10000 every year.<br>
Recommendation #2<br>
	Wipro, founded in 1981, provides placement in website_development at Rs.200000 LPA <br>
	Has a probation period of 2 months and salary increase of Rs.10000 every year.<br>
Recommendation #3<br>
	Infosys, founded in 1981, provides placement in website_development at Rs.200000 LPA <br>
	Has a probation period of 3 months and salary increase of Rs.10000 every year.<br>
<br>

5. Some students look for higher studies/civil service exams/startups<br>
Profile overview of Mohana Ganesh<br>
	SkillSet(s): [reinforcement_learning]<br>
	Interest(s): [reinforcement_learning, deep_learning]<br>
	Looking for: [higherStudies]<br>
<br>
There is no recommendation as you are aiming for higher studies.<br>
<br>

6. Some students look for specific domain based company<br>
All the recommendations in this system happens based on the domains.<br>
<br>
