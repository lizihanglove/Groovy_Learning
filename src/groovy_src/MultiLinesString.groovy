/**
 * 多行字符串
 *
 * Created by lizihanglove on 2017/5/15.
 */

def multilineString = '''I am
a string 
with many lines'''
println multilineString
def value = 25
def multilineStringWithValue = """I am
a string 
with many lines
with value $value"""
println multilineStringWithValue