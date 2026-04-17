public class ExcelExportFactory extends ExportFactory {
    @Override
    public Export createExport() {
        return new ExcelExport();
    }
}
