import pandas as pd
import numpy as np

data = {
    'Name': ['John', 'Jane', 'Emily', 'Michael'],
    'Age': [28, 34, np.nan, 40],
    'Salary': [50000, np.nan, 45000, 70000],
    'Department': ['IT', 'HR', 'IT', np.nan]
}

df = pd.DataFrame(data)

df['Age'].fillna(df['Age'].mean(), inplace=True)
df.dropna(inplace=True)

print(df)