"""
TreeSitter Class
"""

from typing import List
from tree_sitter import Language, Node, Parser, Query
import tree_sitter_java as tsjava
from aster.utils.treesitterutils import TreesitterUtils


class TreeSitter:
    def __init__(self) -> None:
        self.tsu = TreesitterUtils()
        self.language: Language = Language(tsjava.language())
        self.parser: Parser = Parser(self.language)

    def get_lexical_tokens(self, code: str, filter_by_node_type: List[str] = []) -> List[str]:
        """
        Get the lexical tokens given the code
        Parameters
        ----------
        filter_by_node_type: If needed, filter the type of the node
        code: Java code
        Returns
        -------
        List[str]
        List of lexical tokens
        """
        tree = self.parser.parse(bytes(code, "utf-8"))
        root_node = tree.root_node
        lexical_tokens = []

        def collect_leaf_token_values(node):
            if len(node.children) == 0:
                if len(filter_by_node_type) > 0:
                    if node.type in filter_by_node_type:
                        lexical_tokens.append(code[node.start_byte:node.end_byte])
                else:
                    lexical_tokens.append(code[node.start_byte:node.end_byte])
            else:
                for child in node.children:
                    collect_leaf_token_values(child)

        collect_leaf_token_values(root_node)
        return lexical_tokens

    @staticmethod
    def separate_assertions_new(code_block: str) -> tuple[str, str]:
        code_block_lines = code_block.splitlines()
        code_block_lines_without_assertions = []
        code_block_without_assertions = ""
        assert_lines = []
        for line in code_block_lines:
            if line.strip() == '{' or line.strip() == '}' or line.strip().startswith('//'):
                continue
            elif (line.strip().startswith("assert") or line.strip().startswith("fail(") or
                  line.strip().startswith("verify(") or line.strip().startswith('verifyException(')):
                assert_lines.append(line)
            else:
                code_block_lines_without_assertions.append(line)
        assert_block = "\n".join(assert_lines)
        if len(code_block_lines_without_assertions) > 0:
            code_block_without_assertions = '\n'.join(code_block_lines_without_assertions)
        return assert_block, code_block_without_assertions
