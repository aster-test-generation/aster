
from tree_sitter import Language, Node, Parser, Query
import tree_sitter_java as tsjava
from dataclasses import dataclass
from typing import Dict, List, Tuple
from copy import deepcopy


@dataclass
class Captures:
    """This class is a dataclass that represents the captures from a tree-sitter query.
    Attributes
    ----------
    captures : List[Capture]
        A list of captures from the tree-sitter query.
    """

    @dataclass
    class Capture:
        """This class is a dataclass that represents a single capture from a tree-sitter query.
        Attributes
        ----------
        node : Node
            The node that was captured.
        name : str
            The name of the capture.
        """

        node: Node
        name: str

    def __init__(self, captures: List[Tuple[Node, str]]):
        self.captures = [self.Capture(node=node, name=text) for node, text in captures]

    def __getitem__(self, index: int) -> Capture:
        """Get the capture at the specified index.
        Parameters:
        -----------
        index : int
            The index of the capture to get.
        Returns
        -------
        Capture
            The capture at the specified index.
        """
        return self.captures[index]

    def __iter__(self):
        """Return an iterator over the captures."""
        return iter(self.captures)


def _replace_in_source(
        source_class_code: str,
        original_test_method_dict: dict,
        modified_test_method_dict: dict,
):
    """
    Returns a modified source using original test methods and modified ones.

    Parameters:
    -----------
    source_class_code : str
        String containing code for a java class.

    original_test_method_dict: dict
        Dictionary of original test methods in the java class.

    modified_test_method_dict: dict
        Dictionary of modified test methods

    Returns:
    --------
    str
        modified source after removing duplicate test methods and merging decomposed ones.
    """
    modified_source = deepcopy(source_class_code)
    for _, body in original_test_method_dict.items():
        modified_source = modified_source.replace(body, "")
    modified_source = modified_source[: modified_source.rfind("}")]
    for _, body in modified_test_method_dict.items():
        modified_source = modified_source + "\n" + body
    modified_source = modified_source + "\n}"
    return modified_source


class TreesitterUtils:
    """Use tree-sitter to perform code analysis.
    Parameters
    ----------
    lang : str, optional
        The language to use for parsing the source code, by default "java"
    """

    def __init__(self, lang: str = "java") -> None:
        self.language: Language = Language(tsjava.language())
        self.parser: Parser = Parser(self.language)

    def frame_query_and_capture_output(self, query: str, code_to_process: str) -> Captures:
        """Frame a query for the tree-sitter parser.
        Parameters
        ----------
        code_to_process
        query : str
            The query to frame.
        """
        framed_query: Query = self.language.query(query)
        tree = self.parser.parse(bytes(code_to_process, "utf-8"))
        return Captures(framed_query.captures(tree.root_node))

    # copied from zircon repo
    def safe_ascend(self, node: Node, ascend_count: int) -> Node:
        """Safely ascend the tree. If the node does not exist or if it has no parent, raise an error.
        Parameters
        ----------
        node : Node
            The node to ascend from.
        ascend_count : int
            The number of times to ascend the tree.
        Returns
        -------
        Node
            The node at the specified level of the tree.
        Raises
        ------
        ValueError
            If the node has no parent.
        """
        if node is None:
            raise ValueError("Node does not exist.")
        if node.parent is None:
            raise ValueError("Node has no parent.")
        if ascend_count == 0:
            return node
        else:
            return self.safe_ascend(node.parent, ascend_count - 1)
