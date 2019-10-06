/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Brad
 */
public class Displayable {
    ArrayList<Transaction> transactions;
    Transaction tArray[];
    private int firstLine;
    private int lastLine;
    private int numberOfLines;
    private int getLineToHighlight;
    private int sortType;
    private int sortField;
    private int fieldIndex;
    private boolean searchResult;
    private int tableMemberIndex;
    private ArrayList<HashMap> hashmaps;
}
