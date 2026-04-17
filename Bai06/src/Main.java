public class Main {
    public static void main(String[] args) {
        FileItem file1 = new FileItem("a.txt", 12);
        FileItem file2 = new FileItem("b.txt", 8);
        Shortcut shortcut1 = new Shortcut("a-shortcut", file1);
        FileItem readmeMd = new FileItem("readme.md", 4);
        Folder folder1 = new Folder("docs");
        Folder folder2 = new Folder("root");

        folder1.addSub(file1);
        folder1.addSub(file2);
        folder1.addSub(shortcut1);
        folder2.addSub(folder1);
        folder2.addSub(readmeMd);

        folder2.print("");



    }
}
