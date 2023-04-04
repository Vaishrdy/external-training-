Notes on javascipt

>>JavaScript is an object-based scripting language which is lightweight and cross-platform. JavaScript is not a compiled language,
 but it is a translated language. The JavaScript Translator (embedded in the browser) is responsible for translating the JavaScript 
code for the web browser.
>>It is dynamically typed lang.
>>Features of JavaScript 
* An interpreted language 
*Embedded within HTML 
*Minimal Syntax - Easy to learn( C syntax and java OOC) 
* Mainly used for client-side scripting because all browsers support it 
* Designed for programming user events 
* Platform Independence/ Architecture Neutral
>>JS is a client side and sever side lang.
>>We have to keep ; for sure for mulitiline and optional for single line.
●Comments:
//Single line comments

/*multi
line comment
*/
●Data Types
1.Primitive
a)Boolean: True OR False
var YES=true;
var NO=false;
if(YES)
{
     alert("I am executed");
}
if(NO)
{
     alert("I am  notexecuted");
}
b)Undefined: when no value is assigned before using it ie.,lack of value or unknown values
c)Null:you can assign null to a variable to denote that currently that varable does not have any value but can have it later on.
var myvar=null;
alert(myvar)//null
d)Number:number type repr integer.float,hexadecimal,octal,expo value
var int=10;
vr float=10.55;
var hex=0xfff;
var exponential=2.56e3;
var octal=030;

2.User-defined
a)Object:It is like any other variable,the only difference is that an object holds multiple values in terms of props and methods.
Props can hold values of primitive data types and methods as functions.
b)Function:A function allows to define a block of code,givr it a name and then execute it as many times as you want.

●To give input from user in JS we use prompt and we alert or console.log to print output.
●to check output type of variable:
in html file>inside script>
var num=57675349n;
console.log(typeof num);

●Variables- A container for a value
Keywords to create variables:  let,const,var
*LET:
-->Variables defined with let cannot be Redeclared.
-->Variables defined with let must be Declared before use.
-->Variables defined with let have Block Scope.
Variables declared inside a { } block cannot be accessed from outside the block:
{
  let x = 2;
}
// x can NOT be used here
-->Syntax :: let x = "John Doe";
*CONST:
-->Variables defined with const cannot be Redeclared.
-->Variables defined with const cannot be Reassigned.[But you CAN:Change the elements of constant array,
Change the properties of constant object]
-->Variables defined with const have Block Scope.
const PI = 3.141592653589793;
PI = 3.14;      // This will give an error
PI = PI + 10;   // This will also give an error

Q)When to use JavaScript const?
ANS)Always declare a variable with const when you know that the value should not be changed.
Use const when you declare:
-A new Array
-A new Object
-A new Function
-A new RegExp

EXAMPLES:
**// You can create a const object:
const car = {type:"Fiat", model:"500", color:"white"};

// You can change a property:
car.color = "red";

// You can add a property:
car.owner = "Johnson";

**But you can NOT reassign the object:
const car = {type:"Fiat", model:"500", color:"white"};
car = {type:"Volvo", model:"EX60", color:"red"};    // ERROR

*VAR:
The var statement declares a variable. Variables are containers for storing information. 
Creating a variable in JavaScript is called "declaring" a variable: var carName; After the declaration, the variable is empty (it has no value).

●Operators
Binary op-1+2
unary op-2++,--2
Assignment op-x=y

●Control flow statements;
**IF_ELSE
if (condition){
           console.log("runs if true");
}else{
           console.log("runs if not true");
}
**SWITCH
switch(expression){
         case val1:
         //if stmts matches val1 then it executes
        [break;]
........
         case valN:
         //if stmts matches valN then it executes
        [break;] 
[default:
//if above stmts doesnot match then default executes
[break;]
]
}

●Loops in JS:
FOR LOOP:
for(let i=0;i<=10;i++){
console.log("Namaste world!");
}
WHILE:
let i=0;
while(i<10){
console.log("Namaste world!");
i++
}
DO-WHILE:
let i=10;
do{
console.log("Namaste world!");
i++
}
while(i<=10)
FOR.....IN:
//objects
let animal={
        name:"Zebra",
         leg:4
};
for(let key in animal){
        console.log(key,animal[key]);
}
//Arrays
let names=["Abcd","efgh","ijkl","mnop"];
for (let index in names){
console.log(index);//gives only index
console.log(index,names[index]);//gives index and names
}
//For......of loop
for (let name of names){
console.log(name);//gives only names 
}

●Functions:
function name(parameter1,parameter2){
      //code to be executed
}

EX:
function cookMaggi(maggi,pani,pan){
       console.log("Your maggie will be ready in"
        +maggi*2
        +"minutes"
        +"and ingredients used are:-"
        +maggi+ "Maggi"
        +pani+"cups of water"
        +"using"+pan+"pan"  )
}
cookMaggi(4,8,1);

>>using JS functions in html 
body>>h1-Function in JS>>script src="function.js">>script src="makeSandwich.js"
Now open function.js and write the code

-----coding ninjas-----
*Process.stdin 
The process.stdin property is an inbuilt application programming interface of the process module which listens for the user input. The stdin property of the process object is a Readable Stream. It uses on( ) function to listen for the event.
Syntax: process.stdin.on( ) ;
Return Value: It doesn’t return any value. Parameters: This property takes Input from the user.
-----------
●Strings:
let string ="This is a string";
let badstrring='you\'ve got no rights';


