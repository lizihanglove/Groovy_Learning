/**
 * 使用多赋值
 *
 * Created by lizihanglove on 2017/5/9.
 */
def splitName(fullName){
    fullName.split(" ")
}

def (firstName,lastName) = splitName("james bond")
println firstName +"--"+lastName


def a = "one"
def b = "mighty"
println a+"-"+b

(b,a) = [a, b]
println a+"-"+b

def (name1,name2) = ["Tom","Jerry","Spike"]

println name1+"-"+name2




