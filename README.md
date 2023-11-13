# Mini-Banking-App
I wanted to create very simple console project from basic knowledge I learnd in Java.

# Content of Project
* [General info])(#general-info)
* [Technologies](#technologies)
* [Setup](#setup)

## General info
It's very simple project, which use basics mechanism in Java. That's my first project and I wanted to turned acquired theory into practice. In this project we can make deposit, withdraw and transfer. Accounts are stored in ArrayList, which means that number account is index number of stored object. If we want to create an account we need to creat an owner. We can create a banking account and saving account. I used in this project two design patterns: MVC and Observer. Observer is used when transfer is more than 10k and inform TaxOffice automatically. I created NoMoneyException, which is used when there is no sufficient funds in account from we can make withdraw/transfer. Also, in method transfer is condition, which checks if account exsist. 

## Technologies
<ul>
<li>Java 15</li>
</ul>

## Setup
You can run this project on IDE for example IntelliJ.
