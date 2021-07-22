# SideD00r
You have a Front Door, a Backdoor, why not a SideD00r...

SideD00r is a lightweight piece of software allows you to setup a remote shell reverse proxy of sorts. Essentially, running this on any/most machines, will allow you to access the shell/cmd remote, with only simple port forwarding required.


## Ubuntu/Debian Persistence
Related Files:
 - iptables.sh > https://github.com/Aaron-Akhtar/SideD00r/blob/main/iptables.sh
 - sided00r.service > https://github.com/Aaron-Akhtar/SideD00r/blob/main/sided00r.service
 - start.sh > https://github.com/Aaron-Akhtar/SideD00r/blob/main/start.sh

*Documentation for these files can be found below.*


## sided00r.service
the SideD00r Service File is used to create the ubuntu system service located in `/etc/systemd/system/` that essentially starts SideD00r upon every boot under screen.


## start.sh
the *start.sh* file will start the SideD00r screen, that runs the SideD00r in the background and runs the iptables script to open the SideD00r TCP port to the public. (**'SCREEN' is a dependency that may need to be installed** -> `apt-get install screen -y`)



## iptables.sh
the *iptables.sh* file will allow you to execute the required iptables / firewall rules to allow connections into SideD00rs remote TCP service.
