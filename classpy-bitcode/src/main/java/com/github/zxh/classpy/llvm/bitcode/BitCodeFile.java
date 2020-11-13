package com.github.zxh.classpy.llvm.bitcode;

// https://llvm.org/docs/BitCodeFormat.html
public class BitCodeFile extends BitCodePart {

    {
        // Wrapper
        add("Magic",   new U32());
        add("Version", new U32());
        add("Offset",  new U32());
        add("Size",    new U32());
        add("CPUType", new U32());
    }

//
//    private List<FuncType> funcTypes;
//    private List<Import> imports;
//    private List<Import> importedFuncs;
//    private List<Import> importedGlobals;
//    private List<Index> funcs;
//    private List<Global> globals;
//    private List<Export> exports;
//    private List<Code> codes;
//
//    public List<FuncType> getFuncTypes() { return funcTypes; }
//    public List<Import> getImports() { return imports; }
//    public List<Import> getImportedFuncs() { return importedFuncs; }
//    public List<Import> getImportedGlobals() { return importedGlobals; }
//    public List<Index> getFuncs() { return funcs; }
//    public List<Global> getGlobals() { return globals; }
//    public List<Export> getExports() { return exports; }
//    public List<Code> getCodes() { return codes; }
//
//    @Override
//    protected void readContent(BitCodeReader reader) {
//        readBytes(reader, "magic", 4);
//        readBytes(reader, "version", 4);
//        readSections(reader);
//        funcTypes = getSectionItems(1, FuncType.class);
//        imports = getSectionItems(2, Import.class);
//        importedFuncs = imports.stream()
//                .filter(Import::isFunc)
//                .collect(Collectors.toList());
//        importedGlobals = imports.stream()
//                .filter(Import::isGlobal)
//                .collect(Collectors.toList());
//        funcs = getSectionItems(3, Index.class);
//        globals = getSectionItems(6, Global.class);
//        exports = getSectionItems(7, Export.class);
//        codes = getSectionItems(10, Code.class);
//    }
//
//    private void readSections(WasmBinReader reader) {
//        while (reader.remaining() > 0) {
//            Section section = new Section();
//            add("section", section);
//            section.read(reader);
//        }
//    }
//
//    private <T> List<T> getSectionItems(int secID, Class<T> itemClass) {
//        return getParts().stream()
//                .filter(c -> c instanceof Section)           // section?
//                .map(c -> (Section) c)                       // yes
//                .filter(sec -> sec.getID() == secID)         // section
//                .map(sec -> (Vector) sec.getParts().get(2))  // vector
//                .flatMap(v -> v.getParts().stream().skip(1)) // items
//                .map(c -> itemClass.cast(c))                 // Ts
//                .collect(Collectors.toList());
//    }
//
//    public void getFuncNames() {
//        Section customSec = getParts().stream()
//                .filter(c -> c instanceof Section)
//                .map(c -> (Section) c)
//                .filter(sec -> sec.getID() == 0)
//                .findFirst()
//                .orElse(null);
//    }

}
