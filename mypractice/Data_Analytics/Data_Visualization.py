import pandas as pd
import matplotlib.pyplot as plt

sales_data = {
    'Month': ['January', 'February', 'March', 'April', 'May', 'June'],
    'Sales': [150, 200, 250, 300, 350, 400]
}

df = pd.DataFrame(sales_data)

X = df['Month'].values
y = df['Sales'].values

plt.plot(X,y)
plt.show()

