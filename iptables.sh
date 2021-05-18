# "%port%" - replace with the port your instance of SideD00r is running, by default the port is 900.
iptables -I INPUT -p tcp --dport %port% -j ACCEPT;
