CREATE DATABASE SRC_TRAVEL ON PRIMARY
(
	NAME='SRC_TRAVEL_P',
	FILENAME='E:\BUS MANAGEMENT SYSTEM\DATABASE\SRC_TRAVEL.mdf'
)
LOG ON
(
	NAME='SRC_TRAVEL_L',
	FILENAME='E:\BUS MANAGEMENT SYSTEM\DATABASE\SRC_TRAVEL.ldf'
)
Go
use SRC_TRAVEL
Go
create TABLE TB_ADMIN
(
	A_id int primary key,
	A_name nvarchar(20) not null,
	A_pass nvarchar(20) not null,
	A_status nvarchar(10) not null,
)

--- insert into TB_ADMIN values(1,'admin','admin','online')

Go
create table TB_employe
(
	E_id int primary key identity(10,1),
	A_id int foreign key references TB_ADMIN(A_id),
	E_name nvarchar(30) not null,
	E_Gender nvarchar(8) not null,
	E_contact nvarchar(20) not null,
	E_location nvarchar(30) not null,
	E_qualificaiton nvarchar(30) not null,
	E_Age int not null,
	E_Cnic nvarchar(20) Unique not null,
	E_Email nvarchar(20) not null,
)
Go
--select * from TB_EMPLOGIN
--select * from TB_EMPLOye


--nsert into TB_employe values(1,'Ali','male','0313-1232123','karachi','Graduate',27,'431-000-1234567','Ali@gmail.com')
--insert into TB_employe values(1,'waleed','male','0343-0999123','karachi','Graduate',25,'4221-3-1234567','waleed@hotmail.com')





create table TB_EMPLOGIN
(
	E_id int foreign key references TB_employe(E_id),
	Elogin_ID int primary key identity(100,1),
	Elogin_name nvarchar(20) not null,
	Elogin_pass nvarchar(20) not null, 
	Elogin_status nvarchar(10) not null,
)

Go
--insert into TB_EMPLOGIN values (10,'Ali','123','offline')
--insert into TB_EMPLOGIN values (11,'waleed','123','online')

create table TB_customer
(
	Cust_ID int primary key identity(1001,1),
	E_id int foreign key references TB_employe(E_id),
	Cust_Name nvarchar(20) not null,
	Cust_FName nvarchar(20) not null,
	Cust_Gender nvarchar(8) not null,
	Cust_Email nvarchar(20) not null,
	Cust_Cnic nvarchar(20) Unique not null,
	Cust_DOB Date,
	Cust_Age int default '20',
)
Go
--insert into TB_customer values(11,'ahmed','Shamim','male','unknown@live.com','null','1990-08-05',default)
--insert into TB_customer values(11,'Junaid','male','junaid@live.com','null','1990-12-20',default)
--insert into TB_customer values(11,'Aqil','male','aqil@live.com','99999-111-99999','1960-12-20',default)
--insert into TB_customer values(11,'arsalan','male','Abc@live.com','41231-222-31321312','1995-08-05',default)




create table TB_buses
(
	Bus_id int primary key identity(2000,1),
	Bus_Name Nvarchar(20) not null,
	Bus_Type Nvarchar(20) not null,
	Bus_Capacity int not null,
	Bus_Number varchar(20) Unique not null,
	Bus_PricePerKm float not null 
)
Go


--insert into TB_buses values ('Volvo-AC','AC',55,'bus-KL',2.5)
--insert into TB_buses values ('Volvo-Non-AC','Non-AC',50,'bus-H5',1.65)
--insert into TB_buses values ('Luxury','Normal',50,'bus-Quetta',1.40)
--insert into TB_buses values ('Express','Normal',48,'bus-H11',1.30)
--insert into TB_buses values ('Express2','Normal',48,'bus-H12221',1.30)

create table TB_Route
(
	R_id int primary key identity(3000,1),
	R_Name nvarchar(40) Unique not null,
	R_Start nvarchar(20) not null,
	R_End nvarchar(20) not null	
)



---select * from TB_Routinee
---delete from TB_Routinee where Rout_ID=50000

---truncate table TB_Customer

--insert into TB_Route values('karachi To lahore','karachi','lahore')
--insert into TB_Route values('karachi To Hyderabad','karachi','hyderabad',1)
--insert into TB_Route values('karachi To Quetta','karachi','Quetta',5)
--insert into TB_Route values('karachi To hyderabad','karachi','hyderabad',1)

Go
create table TB_RouteCover
(
	RC_id int primary key identity(4000,1),
	R_id int foreign key references TB_Route(R_id),
	RC_StopName nvarchar(30) not null,
	RC_Dist_bw_Stops float not null
)

--select * from TB_RouteCover
--insert into TB_RouteCover values(3000,'Hyd',167.7)
--insert into TB_RouteCover values(3000,'Moro','2',323)
--insert into TB_RouteCover values(3000,'Ranipur','3',350)
--insert into TB_RouteCover values(3000,'Bhawalpur','4',400)

--insert into TB_RouteCover values(3018,'a',5,18)
--insert into TB_RouteCover values(3001,'Hyderabad','1',157)

--insert into TB_RouteCover values(3002,'Bela','1',300)
--insert into TB_RouteCover values(3002,'Khuzdar','2',150)
--insert into TB_RouteCover values(3002,'Surab','3',100)
--insert into TB_RouteCover values(3002,'Kalat','4',65)
--insert into TB_RouteCover values(3002,'Mastung','5',80)

--insert into TB_RouteCover values(3003,'Hyderabad','1',157)
--insert into TB_RouteCover values(3019,'Hyderabad',1,157)

Go
Create table TB_Routinee 
(
	Rout_ID int primary key identity(5000,1),
	Bus_id int foreign key references TB_buses(Bus_id),
	R_id int foreign key references TB_Route(R_id),
	Rout_Date date,
	Rout_time time(0),
	unique (bus_id),
	unique (R_id)		
)

--insert into TB_Routinee values (2000,3000,'2013-10-19','22:19')
--insert into TB_Routinee values (2001,3001,'2013-10-19','22:19')
Go
Create table TB_Booking
(
	Book_id int primary key identity(6000,1),
	Cust_ID int foreign key references TB_customer(Cust_ID),
	Rout_ID int foreign key references TB_Routinee(Rout_ID),
	Bus_Id int foreign key references TB_buses,
	
	Start_stop nvarchar(20) not null,	
	Last_Stop nvarchar(20)not null,
	
	Av_seats int check(Av_seats < 60) default '1',
	Booked_seats int Default '1',
	Booking_Date date,
	Seat_num int check (Seat_num< 60),
	status nvarchar(10) default 'Confirm',
)

--select * from TB_Ticket

--insert into TB_Booking values(1003,5000,2000,'karachi','sialkot',default,default,GETDATE(),51,default)
--insert into TB_Booking values(1003,5000,2000,'karachi','Lahore',default,default,GETDATE(),52,default)
--insert into TB_Booking values(1004,5002,2002,'karachi','Lahore',default,default,GETDATE(),45,default)
--insert into TB_Booking values(1006,5000,2000,'karachi','sialkot',default,default,GETDATE(),34,default)




Go
create table TB_Ticket
(	Tp_ID int identity(50000,1),
	Cust_ID int foreign key References TB_customer(Cust_ID),
	Cust_Name nvarchar(30),
	Cust_Route nvarchar(30) ,
	Cust_From nvarchar(30),
	Cust_To nvarchar(30),
	Cust_BusNum nvarchar(20),
	Booking_date date,
	Bus_date date,
	Bus_time time(0),
	Seat_num int,
	Tp_price float,
	Ticket_status nvarchar(10)default 'Confirm',
)



----- END OF TABLES ------


select * from TB_ADMIN
select * from TB_employe
select * from TB_EMPLOGIN
select * from TB_buses
select * from TB_Route
select * from TB_RouteCover
select * from TB_Booking
select * from TB_Ticket
select * from TB_Routinee
select * from TB_customer


-------Trigger For Booked seats and Inserting Record In the Ticket Table ---------

create trigger SEATS on TB_Booking
	For Insert as
	Begin
		Set NoCount On;

		
		
		declare @id int
		declare @cap int
		

		declare @custid int
		declare @custname nvarchar(30)
		declare @custroute nvarchar(30)
		declare @from nvarchar(30)
		declare @to nvarchar(30)
		declare @custbusno nvarchar(30)
		declare @bookingdate date
		declare @busdate date
		declare @bustime time
		declare @seatnum int
				-- for price--
				declare @km float
				declare @dis int
				declare @a int
				declare @price float 
		
		declare @status nvarchar(10)
		
		
		set @cap = (select Bus_Capacity from TB_buses where Bus_id=(select Bus_id from inserted));
		set @id = (select Bus_id from inserted);
	
		set @custid = (select Cust_Id from inserted)		
		set @custname = (select Cust_Name from TB_customer where Cust_ID = (select Cust_Id from inserted))
		set @custroute= (select R_Name from TB_Route where R_id =(select R_id from TB_RouteCover Where RC_StopName =(select Last_Stop from inserted)))
		
		set @from = (select Start_stop from inserted)
		set @to = (select Last_Stop from inserted)
		
		set @custbusno = (select Bus_Number from TB_buses where Bus_ID = (select Bus_Id from inserted))
		set @bookingdate = (select Booking_Date from TB_Booking where Cust_ID = (select Cust_Id from inserted))
		set @busdate = (select rout_date from TB_Routinee where bus_ID=(select Bus_id from inserted))
		set @bustime = (select rout_time from TB_Routinee where bus_ID=(select Bus_id from inserted))
		set @status = 'Confirm'
		set @seatnum = (select seat_num from TB_Booking where Cust_ID =(select Cust_id from inserted))
			
		set @dis =(select Bus_PricePerKm from TB_buses where Bus_id = (select Bus_id from inserted))
			/*set @km =(select SUM (RC_Dist_bw_Stops) from TB_RouteCover where R_id =(select R_id from TB_Routinee where Bus_id = (Select Bus_id from inserted)))
			*/
			
			set @km = (select RC_Dist_bw_Stops from TB_RouteCover where RC_StopName=(select Last_Stop from inserted
			where R_id = (select R_id from TB_Routinee where Rout_id = (select Rout_id from inserted)) ))
			
						
			set @a = (select Cust_age from TB_Customer where Cust_ID = (select Cust_ID from inserted))
			set @price = @km * @dis;
				
		
				
				-- Condition Start --
				Begin
				
				if @a >=5 and @a<=12
				begin
				set @price = @price-@price/2;
				end
				else if @a>=50
				begin
				set @price = @price-(@price/100)*30;	
				end
				
				End
				
				
				-- Condition End --

		Update TB_Booking set Booked_seats = (select count(*) from TB_Booking where Bus_Id= @id);
		Update TB_Booking set Av_seats = (@cap)-(Booked_seats) where Bus_Id= @id;
		insert into TB_Ticket values(@custid,@custname,@custroute,@from,@to,@custbusno,@bookingdate,@busdate,@bustime,@seatnum,@price,@status)

	End
	-- Trigger End--
	
	-- Trigger For Customer's AGE --
	create trigger Birthdate on TB_customer
	For Insert,Update as
	Begin
		Set NoCount On;
								
		declare @age int
				declare @date1 date
				declare @date2 date
				
				set @date1 = (select Cust_DOB from TB_Customer where Cust_ID = (select Cust_ID from inserted))
				set @date2 = getdate()
				
				set @age = datediff(year,@date1,@date2)
		Update TB_customer set Cust_age = @age where Cust_ID = (select Cust_ID from inserted)
	End	
	-- Trigger End--
	
	
	--- Trigger For Cancelled Booking---
	create trigger TicketCancelled on TB_Ticket
	For Update as
	Begin
		Set NoCount On;
								
				declare @result int
				declare @date1 date
				declare @date2 date
				declare @price int
				declare @tpid int


				set @tpid = (select Tp_id from inserted)
				set @date1 = (select Bus_Date from TB_Ticket where Cust_ID = (select Cust_ID from inserted ))
				set @date2 = getdate()
				set @price = (select Tp_price from TB_Ticket where Cust_ID = (select Cust_ID from inserted ))
				set @result = datediff(day,@date2,@date1)
				
				
				Begin
				if @result >= 2
				begin
				set @price = 0
				end
				else if @result = 1
				begin
				set @price = @price-(@price/100)*15;	
				end
				else if @result = 0
				begin
				set @price = @price-(@price/100)*30;	
				end
				print @price
				print 'Working'
				End
		
		Update TB_Booking set seat_num=null,Cust_Id=null , Booked_seats =null,Rout_ID=null,Bus_ID=null,Start_Stop='null',Last_Stop='null',Av_seats=null where Cust_ID=(select Cust_id from TB_Ticket where TP_ID=@tpid)
		Update TB_Ticket set Tp_price =@price,Cust_name='null',Seat_num=null,Cust_ID=null where TP_ID = @tpid
				
	End
	-- Trigger End--
