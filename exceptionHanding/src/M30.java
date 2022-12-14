/*
if java stme is prodecing a abnormal condition is then eception is occuring
whwereEver error is allow there Exception is allowed
wher ever Throwable is coming Exception and error is occuring
error and exception is upcasting
catch argument is error or exception
of allocatesd memory is not sufficient the StackOverFlowError is  occuring
if heap memory not sufficeint the OutOfMemory is using
while creating an arrray required memory is not avilable then OutOfMemory
if at all clas is not found then using NoClassDefFound
if specigy method is not found is NoSachMethodError
Exception
---------
under Exception some or sub class to exception
if we are refering any member from the null reference we will get NullPointerException
ssomething by/zero Arithmatic Exception aris
ClassCastException  if super class objct converting into sub class type then ClassCastException
NumberFormetException  = unable to convert String into a number
is String containg a alphabet or any char then NumberFormat
in areray while refering to any Index it is OutOfBounds then wewill be getting ArrayIndex
ny passing run time exception classNotFoundException
ClassNotFoundException =to load a class explicity
SQLException  = in JDBC be found while interacting database we required SQLException
while interacting with the file system  =IOException or FileNotFound is same
this topic coming in file handling topic
CloneNotSupportedException  = while performing object cloning CloneNotSupportedException is required
ParseException  = while converting a String into Date  
in cllocrion topic is will come 
IntruptedException = while covring the thread it will know

*/

the below Error and Exception in first row is unchecked
while compiling compiler doesn' required a try catch or throws for uncheked
every error is unchecked and runtime exception is unchecked

in last seven exception(which s second row in exception part) is checked exception
if try catch  or throws are avilable then only  checked is working
in case of try catch and throws we required
throwable class and exception both are acting as a semichecked 
in one senaario it acting like checked and in other side it act like a unchecked
compilation proccess is only syntax checking











							Throwable
							---------
							    |
							    |
		-----------------------------------------------------------------------------------------
		|											|
		|											|
		|											|
		Error
		|
		Exception
		|StackOverFlowError									|
		|OutOfMemoryError									|
		|NoClassDefFoundError						---------------------------------------------------											
		|NoSachMethodError
	    |AssertionError							|									|ClassNotFoundException					
				|									|									|SQLException
												RuntimeException						|IOException
												------------							|FileNotFoundException
													|NullPointerException				|CloneNotSupportedException
													|ArithmeticException				|ParseException
													|ClassCastException					|IntrruptedException
													|NumberFormatException
													|ArryOutOfBoundException				