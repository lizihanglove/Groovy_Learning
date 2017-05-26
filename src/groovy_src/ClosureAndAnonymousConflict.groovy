/**
 * 闭包与匿名内部类的冲突
 *
 * Created by lizihanglove on 2017/5/10.
 */

class Calibrator{
    Calibrator(calculationBlock) {
        print 'using '
        calculationBlock()
    }
}

def calibrator1 = new Calibrator({println 'the calculation provided'})
def closure = { println 'the calculation provided' }
def calibrator2 = new Calibrator(closure)
