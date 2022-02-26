sudo yum -y install wget

$sudo wget -O /etc/yum.repos.d/jenkins.repo https://pkg.jenkins.io/redhat-stable/jenkins.repo 

$sudo rpm --import https://pkg.jenkins.io/redhat-stable/jenkins.io.key 

$sudo yum -y install jenkins----------------------------------------------------------
﻿Update the apt repository
sudo apt update

2) sudo apt install openjdk-8-jdk -y

3) Check the Java Version
java -version

4) Install Maven & Git
sudo apt-get install -y git  maven

5) Check the Verion of Git & Maven
For Git : git --version
For Maven : mvn --version

6) Download & install Jenkins
Open Jenkins website (https://jenkins.io/download/)

Go to Long Term Support
Select Generic Java Package (.war)
We are selecting generic java package file because jenkins will install on those machine where java is already install. If we have java install in windows machine jenkins will work. Only pre requirement is java needs to be install.

For Windows we just need to click on the file and it will download automatically.
For Linux machine enter command wget and paste the url to download the file.
To get the URL right click on generic java package and click on copy link address.


(wget http://mirrors.jenkins.io/war-stable/latest/jenkins.war)


wget  https://get.jenkins.io/war-stable/2.277.2/jenkins.war

11) Start the Jenkins.war file

java -jar jenkins.war