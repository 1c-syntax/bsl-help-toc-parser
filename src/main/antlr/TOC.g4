parser grammar TOC;

options {
    tokenVocab = TOCTokens;
}

tableOfContent: LBRACE chunkCount COMMA chunk (COMMA chunk)* RBRACE EOF;

chunk: LBRACE chunkId COMMA chunkParentId COMMA childCount (COMMA childId)* COMMA propertiesContainer RBRACE;
propertiesContainer: LBRACE NUMBER COMMA NUMBER COMMA nameContainer COMMA htmlPath RBRACE;
nameContainer: LBRACE NUMBER COMMA NUMBER (COMMA nameObject (COMMA nameObject)?)? RBRACE;
nameObject: LBRACE languageCode COMMA name RBRACE;

chunkCount: NUMBER;
chunkId: NUMBER;
chunkParentId: NUMBER;
childCount: NUMBER;
childId: NUMBER;
htmlPath: STRING;
languageCode: STRING;
name: STRING;