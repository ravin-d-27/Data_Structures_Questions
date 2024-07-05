def gas_station(gas, cost):
    fuel = 0
    for start in range(len(gas)):
        trav_gas = gas[start::]+gas[:start+1]
        trav_cost = cost[start::]+cost[:start+1]
        
        for i in range(len(trav_cost)):
            fuel+=trav_gas[i]-trav_cost[i]
            if fuel<0:
                break
        
        if fuel>0:
            return start
        else:
            fuel = 0
    return -1

def gas_station2(gas, cost): # Covering all edge cases
    total_surplus = 0
    current_surplus = 0
    start_station = 0
    
    for i in range(len(gas)):
        total_surplus += gas[i] - cost[i]
        current_surplus += gas[i] - cost[i]
        
        if current_surplus < 0:
            start_station = i + 1
            current_surplus = 0
    
    if total_surplus >= 0:
        return start_station
    else:
        return -1
            
gas = [1,5,3,3,5,3,1,3,4,5]
cost = [5,2,2,8,2,4,2,5,1,2]

print(gas_station(gas, cost))
print(gas_station2(gas, cost))