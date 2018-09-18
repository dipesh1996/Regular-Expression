import re
import sys

pattern = r'(0x|0X)[\d|a-f|A-F]*\.?[0-9|a-f|A-F]*?[P|p][\+\-]?([\d])+[f|F|l|L]?$';
regfile = open(sys.argv[1],'r')
data = regfile.readlines()
regfile.close();	
for i in range(len(data)):
    matches = re.search(pattern, data[i])
    if matches:
        print("Matched: {match}".format(match=data[i]))
    else:
        print("Not Matched: {match}".format(match=data[i]))
