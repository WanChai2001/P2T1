create database if not exists lab01;
use lab01;
create table Manager(
	ManagerID int(8) not null,
    ManagerName varchar(20) not null,
    Salary int(7) not null,
	primary key (ManagerID)
);

create table Project(
	ProjectID int(8) not null,
    ProjectName varchar(30) not null,
    Budget int(10) not null,
    ManagerID int(8) not null,
    primary key (ProjectID),
    foreign key (ManagerID) references Manager(ManagerID)
);

create table Tool(
	ToolID int(8) not null,
    ToolName varchar(30) not null,
    primary key (ToolID)
);

create table UseTool(
	ProjectID int(8) not null,
	ToolID int(10) not null,
	primary key (ProjectID,ToolID),
    foreign key (ProjectID) references Project(ProjectID),
    foreign key (ToolID) references Tool(ToolID)
);

