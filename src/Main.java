//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
//package kadai1;
public class Main {
    public static void main(String[] args) {
        Fool fool = new Fool("怠け者", 80);
        fool.talk();
        fool.watch();
        fool.hear();
        fool.attack(new Matango());
        fool.run();
    }
}