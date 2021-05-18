# "%port%" - replace with the port your instance of SideD00r is running, by default the port is 900.
# "%path%" - replace with your SideD00r Jar File Path.
iptables -I INPUT -p tcp --dport %port% -j ACCEPT; screen -dm java -jar %path%
