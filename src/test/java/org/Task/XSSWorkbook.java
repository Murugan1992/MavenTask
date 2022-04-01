package org.Task;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.EvaluationWorkbook;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.SheetVisibility;
import org.apache.poi.ss.usermodel.Workbook;

public class XSSWorkbook implements Workbook {

	public XSSWorkbook(FileInputStream fin) {
		// TODO Auto-generated constructor stub
	}

	public Iterator<Sheet> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getActiveSheetIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setActiveSheet(int sheetIndex) {
		// TODO Auto-generated method stub

	}

	public int getFirstVisibleTab() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setFirstVisibleTab(int sheetIndex) {
		// TODO Auto-generated method stub

	}

	public void setSheetOrder(String sheetname, int pos) {
		// TODO Auto-generated method stub

	}

	public void setSelectedTab(int index) {
		// TODO Auto-generated method stub

	}

	public void setSheetName(int sheet, String name) {
		// TODO Auto-generated method stub

	}

	public String getSheetName(int sheet) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getSheetIndex(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getSheetIndex(Sheet sheet) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Sheet createSheet() {
		// TODO Auto-generated method stub
		return null;
	}

	public Sheet createSheet(String sheetname) {
		// TODO Auto-generated method stub
		return null;
	}

	public Sheet cloneSheet(int sheetNum) {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterator<Sheet> sheetIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getNumberOfSheets() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Sheet getSheetAt(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	public Sheet getSheet(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeSheetAt(int index) {
		// TODO Auto-generated method stub

	}

	public Font createFont() {
		// TODO Auto-generated method stub
		return null;
	}

	public Font findFont(boolean bold, short color, short fontHeight, String name, boolean italic, boolean strikeout,
			short typeOffset, byte underline) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getNumberOfFonts() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getNumberOfFontsAsInt() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Font getFontAt(int idx) {
		// TODO Auto-generated method stub
		return null;
	}

	public CellStyle createCellStyle() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getNumCellStyles() {
		// TODO Auto-generated method stub
		return 0;
	}

	public CellStyle getCellStyleAt(int idx) {
		// TODO Auto-generated method stub
		return null;
	}

	public void write(OutputStream stream) throws IOException {
		// TODO Auto-generated method stub

	}

	public void close() throws IOException {
		// TODO Auto-generated method stub

	}

	public int getNumberOfNames() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Name getName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<? extends Name> getNames(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<? extends Name> getAllNames() {
		// TODO Auto-generated method stub
		return null;
	}

	public Name createName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void removeName(Name name) {
		// TODO Auto-generated method stub

	}

	public int linkExternalWorkbook(String name, Workbook workbook) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setPrintArea(int sheetIndex, String reference) {
		// TODO Auto-generated method stub

	}

	public void setPrintArea(int sheetIndex, int startColumn, int endColumn, int startRow, int endRow) {
		// TODO Auto-generated method stub

	}

	public String getPrintArea(int sheetIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removePrintArea(int sheetIndex) {
		// TODO Auto-generated method stub

	}

	public MissingCellPolicy getMissingCellPolicy() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setMissingCellPolicy(MissingCellPolicy missingCellPolicy) {
		// TODO Auto-generated method stub

	}

	public DataFormat createDataFormat() {
		// TODO Auto-generated method stub
		return null;
	}

	public int addPicture(byte[] pictureData, int format) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<? extends PictureData> getAllPictures() {
		// TODO Auto-generated method stub
		return null;
	}

	public CreationHelper getCreationHelper() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isHidden() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setHidden(boolean hiddenFlag) {
		// TODO Auto-generated method stub

	}

	public boolean isSheetHidden(int sheetIx) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isSheetVeryHidden(int sheetIx) {
		// TODO Auto-generated method stub
		return false;
	}

	public void setSheetHidden(int sheetIx, boolean hidden) {
		// TODO Auto-generated method stub

	}

	public SheetVisibility getSheetVisibility(int sheetIx) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setSheetVisibility(int sheetIx, SheetVisibility visibility) {
		// TODO Auto-generated method stub

	}

	public void addToolPack(UDFFinder toopack) {
		// TODO Auto-generated method stub

	}

	public void setForceFormulaRecalculation(boolean value) {
		// TODO Auto-generated method stub

	}

	public boolean getForceFormulaRecalculation() {
		// TODO Auto-generated method stub
		return false;
	}

	public SpreadsheetVersion getSpreadsheetVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	public int addOlePackage(byte[] oleData, String label, String fileName, String command) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	public EvaluationWorkbook createEvaluationWorkbook() {
		// TODO Auto-generated method stub
		return null;
	}

}
