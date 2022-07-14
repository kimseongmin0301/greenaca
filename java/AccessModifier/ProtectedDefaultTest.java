package AccessModifier;

import variable.ProtectedDefault;

public class ProtectedDefaultTest extends ProtectedDefault{
    public static void main(String[] args) {
        ProtectedDefaultTest pvd = new ProtectedDefaultTest();

        pvd.Default=10;
        pvd.Protected=10;
        pvd.Def();
        pvd.Pro();
    }
}
