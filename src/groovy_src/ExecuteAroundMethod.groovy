/**
 * Created by lizihanglove on 2017/5/12.
 */

class Resource{
    def open(){
        println 'opening'
    }
    def read(){
        println 'reading'
    }
    def write(){
        println 'writing'
    }
    def close(){
        println 'closing'
    }

    def static use(closure){
        def r = new Resource()
        try {
            r.open()
            closure(r)
        }finally {
            r.close()
        }
    }
}

def resource = new Resource()
resource.open()
resource.read()
resource.write()


Resource.use{re ->
    re.read()
    re.write()
}