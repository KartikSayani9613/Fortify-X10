
@x10.runtime.impl.java.X10Generated
public class Hello extends x10.core.Ref implements x10.serialization.X10JavaSerializable
{
    public static final x10.rtt.RuntimeType<Hello> $RTT = 
        x10.rtt.NamedType.<Hello> make("Hello",
                                       Hello.class);
    
    public x10.rtt.RuntimeType<?> $getRTT() { return $RTT; }
    
    public x10.rtt.Type<?> $getParam(int i) { return null; }
    
    private Object writeReplace() throws java.io.ObjectStreamException {
        return new x10.serialization.SerializationProxy(this);
    }
    
    public static x10.serialization.X10JavaSerializable $_deserialize_body(Hello $_obj, x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        if (x10.runtime.impl.java.Runtime.TRACE_SER) { x10.runtime.impl.java.Runtime.printTraceMessage("X10JavaSerializable: $_deserialize_body() of " + Hello.class + " calling"); } 
        return $_obj;
    }
    
    public static x10.serialization.X10JavaSerializable $_deserializer(x10.serialization.X10JavaDeserializer $deserializer) throws java.io.IOException {
        Hello $_obj = new Hello((java.lang.System[]) null);
        $deserializer.record_reference($_obj);
        return $_deserialize_body($_obj, $deserializer);
    }
    
    public void $_serialize(x10.serialization.X10JavaSerializer $serializer) throws java.io.IOException {
        
    }
    
    // constructor just for allocation
    public Hello(final java.lang.System[] $dummy) {
        
    }
    
    

    
    
    //#line 6 "/home/pirate/Fortify-X10/Transpiler/sample/src/Hello.x10"
    public static class $Main extends x10.runtime.impl.java.Runtime
    {
        // java main method
        public static void main(java.lang.String[] args) {
            // start native runtime
            new $Main().start(args);
        }
        
        // called by native runtime inside main x10 thread
        public void runtimeCallback(final x10.core.Rail<java.lang.String> args) {
            // call the original app-main method
            Hello.main(args);
        }
    }
    
    // the original app-main method
    public static void main(final x10.core.Rail<java.lang.String> args) {
        
        //#line 7 "/home/pirate/Fortify-X10/Transpiler/sample/src/Hello.x10"
        final x10.io.Printer t$4340 = ((x10.io.Printer)(x10.io.Console.get$OUT()));
        
        //#line 7 "/home/pirate/Fortify-X10/Transpiler/sample/src/Hello.x10"
        t$4340.println(((java.lang.Object)("Hello")));
    }
    
    
    //#line 5 "/home/pirate/Fortify-X10/Transpiler/sample/src/Hello.x10"
    final public Hello Hello$$this$Hello() {
        
        //#line 5 "/home/pirate/Fortify-X10/Transpiler/sample/src/Hello.x10"
        return Hello.this;
    }
    
    
    //#line 5 "/home/pirate/Fortify-X10/Transpiler/sample/src/Hello.x10"
    // creation method for java code (1-phase java constructor)
    public Hello() {
        this((java.lang.System[]) null);
        Hello$$init$S();
    }
    
    // constructor for non-virtual call
    final public Hello Hello$$init$S() {
         {
            
            //#line 5 "/home/pirate/Fortify-X10/Transpiler/sample/src/Hello.x10"
            
            
            //#line 5 "/home/pirate/Fortify-X10/Transpiler/sample/src/Hello.x10"
            this.__fieldInitializers_Hello();
        }
        return this;
    }
    
    
    
    //#line 5 "/home/pirate/Fortify-X10/Transpiler/sample/src/Hello.x10"
    final public void __fieldInitializers_Hello() {
        
    }
}

