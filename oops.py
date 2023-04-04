'''class student:
    def __init__ (self,name):#constructor is created..self is used to say that this method belongs to current class
        self.name=name 
    def say_hello(self):
        print(self.name)#In this method if name varuable is not declared in method say_hello as we referred as self.name 
                        #it becomes class variable like name=
ob1=student("Shivani")
ob1.say_hello()
'''

'''a=[1,2,3]
b=a 
b[0]=100
print(b)
print(a)'''
#here we get both a nad b as[100,2,3] this mechanism is called as "DEEP COPY".
#To avoid this and Preserve list a values we use ".copy() method".
'''a=[1,2,3]
b=a.copy()
b[0]=100
print(b)
print(a)'''#a=[1,2,3] and b=[100,2,3]
'''
class student:
    arr=[]#if we create a arr like this deep copy occurs and changes made in any object of this class will
    def __init__ (self):
        self.arr=[]
    def add_ele(self,value):
        self.arr.append(value)
    def printarr(self):
        print(self.arr)
ob=student()
ob.add_ele(4)
ob.add_ele(5)
ob.add_ele(6)
ob.add_ele(2)
ob1=student()
ob1.add_ele(100)'''


'''
class A:
    def msg_a(self):
        print("In class A")
class B(A):
    def msg_b (self):
        print("In class B")
#till here it is single level inheritence
class C(B):#if we give C(A) then it is "Hierarchial inheritence"
    def msg_c(self):
        print("In class c")
#Till here it ts multilevel inheritence
x=C()
x.msg_a()

class parent_one:
    def msg(self):
        print("In class 1")
class parent_two:
    def msg(self):
        print("In class 2")
class child(parent_one,parent_two):#Parent_one is passed first so method of that class is implemented
    pass
ch=child()
child.msg()
'''
