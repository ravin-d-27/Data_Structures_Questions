import pandas as pd

data = {
    'Name': ['John', 'Jane', 'Emily', 'Michael'],
    'Age': [28, 34, 22, 40],
    'Salary': [50000, 65000, 45000, 70000],
    'Department': ['IT', 'HR', 'IT', 'Marketing']
}

df = pd.DataFrame(data)


# Question: Write a code snippet to filter the DataFrame to include only employees in the "IT" department and display their names and salaries.

expected_df = []

for i in range(len(df)):
    if df["Department"][i]=="IT":
        expected_df.append([df["Name"][i],df["Salary"][i]])

ans = pd.DataFrame(expected_df,columns=["Name","Salary"])
print(ans)

"""
select product, sum(quantity*price) as total_sales from sales group by product
"""