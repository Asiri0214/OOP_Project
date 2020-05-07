/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  kavishna
 * Created: May 7, 2020
 */

create database New_Database;

create table undergraduate(
pno int,
pname varchar(100),
sdate date,
duration int,
price double,
primary key(pno),
unique(pno)
);

create table postgraduate(
pno int,
pname varchar(100),
sdate date,
duration int,
price double,
primary key(pno),
unique(pno)
);

