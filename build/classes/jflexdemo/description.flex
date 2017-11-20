package jflexdemo; 
import java.util.ArrayList;
 
%% 
 
%public 
%class Lexer 
%type Void 


%{
	 private ArrayList<String> list= new ArrayList();
%}

 
%init{ 
    yybegin( FIRST ); 
%init}

keyword = "if" | "then" |"else"| "endif" |"while" |"do"| "endwhile" |"print" |"newline"| "read"
operator = "+" | "-" |"*"| "/"| "="| ">" |">="| "<"| "<="| "==" |"++"| "--"
integer = [0-9][0-9]*
identifier  =  [A-Za-z][A-Za-z]*[0-9]*
string = \"[A-Za-z0-9\+\-\*\/\>\<\=\ ]*\"
comment = "//"[A-Za-z0-9\+\-\*/\>\<\=\ ]*
commentmanylines =  "/*"[A-Za-z0-9\+\-\*\/\>\<\=\ \t\r\n]*"*/"
semicolon    =  \;
bracket  =  [\(\)] 
space    =  \ 
LineTerminator = \r|\n

%state FIRST
 
%% 
<FIRST> 
{ 
  {operator}	
    { 
	System.out.println( "Operator :\t" + yytext()  ); 
    }
  {semicolon} | {bracket}	
    { 
        if(yytext().equals(";"))
        {
            System.out.println( "Semicolon :\t" + yytext()  ); 
        }
        else
        {
            System.out.println( "Bracket :\t" + yytext()  ); 
        }
    }
  {keyword}	
    { 
	System.out.println( "Keyword :\t" + yytext()  ); 
    } 
  {integer}	
    { 
	System.out.println( "Integer :\t" + yytext()  ); 
    } 
  {identifier}	
    { 
       	if(list.contains(yytext()))
        {
            System.out.println( "Identifier "+yytext() +" already exists");
        }
        else
        {
            System.out.println( "New Identifier :\t" + yytext() );
            list.add(yytext());
        }
    }
  {string}	
    { 
        System.out.println( "String :\t" + yytext()  ); 
    }
  {comment}|{commentmanylines}	
    { 
        System.out.println( "Comment :\t" + yytext()  ); 
    }
  {space} | {LineTerminator}	
    { 
    }            
    .	
    { 
        System.err.println( "Invalid character \"" + yytext() + "\"" ); 
    }
}