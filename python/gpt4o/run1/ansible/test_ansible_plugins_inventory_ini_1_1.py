import unittest
from unittest.mock import MagicMock, patch
from ansible.plugins.inventory.ini import InventoryModule
from ansible.errors import AnsibleError, AnsibleParserError


class TestInventoryModule(unittest.TestCase):
    def setUp(self):
        self.inventory = MagicMock()
        self.loader = MagicMock()
        self.path = "test_path"
        self.instance = InventoryModule()

    def test_init(self):
        instance = InventoryModule()
        self.assertIsInstance(instance, InventoryModule)
        self.assertEqual(instance.patterns, {})
        self.assertIsNone(instance._filename)

    def test_parse(self):
        self.loader._get_file_contents.return_value = (b"data", False)
        self.instance.parse(self.inventory, self.loader, self.path, cache=True)
        self.assertEqual(self.instance._filename, self.path)

    def test_parse_with_exception(self):
        self.loader._get_file_contents.side_effect = Exception("Test Exception")
        with self.assertRaises(AnsibleParserError):
            self.instance.parse(self.inventory, self.loader, self.path)

    def test_raise_error(self):
        self.instance._filename = "test_file"
        self.instance.lineno = 10
        with self.assertRaises(AnsibleError) as context:
            self.instance._raise_error("Test Error")
        self.assertEqual(str(context.exception), "test_file:10: Test Error")

    def test_parse_method(self):
        lines = [
            "[group1]",
            "host1",
            "[group2:children]",
            "group1",
            "[group3:vars]",
            "var1=value1"
        ]
        self.instance._compile_patterns = MagicMock()
        self.instance._parse_host_definition = MagicMock(return_value=(["host1"], None, {}))
        self.instance._populate_host_vars = MagicMock()
        self.instance._parse_variable_definition = MagicMock(return_value=("var1", "value1"))
        self.instance._parse_group_name = MagicMock(return_value="group1")
        self.instance._raise_error = MagicMock()
        self.instance.inventory = MagicMock()
        self.instance.inventory.groups = {}

        self.instance._parse(self.path, lines, comment_markers=self.instance._COMMENT_MARKERS)
        self.instance._compile_patterns.assert_called_once()
        self.instance._populate_host_vars.assert_called_once_with(["host1"], {}, "group1", None)
        self.instance._parse_variable_definition.assert_called_once_with("var1=value1")
        self.instance.inventory.set_variable.assert_called_once_with("group3", "var1", "value1")

    def test_parse_invalid_section(self):
        lines = ["[invalid section]"]
        self.instance._compile_patterns = MagicMock()
        self.instance._raise_error = MagicMock()
        self.instance.inventory = MagicMock()
        self.instance.inventory.groups = {}

        self.instance._parse(self.path, lines, comment_markers=self.instance._COMMENT_MARKERS)
        self.instance._raise_error.assert_called_once_with("Invalid section entry: '[invalid section]'. Please make sure that there are no spaces in the section entry, and that there are no other invalid characters")

    def test_parse_unhandled_state(self):
        lines = ["[group1:unknown]", "host1"]
        self.instance._compile_patterns = MagicMock()
        self.instance._raise_error = MagicMock()
        self.instance.inventory = MagicMock()
        self.instance.inventory.groups = {}

        self.instance._parse(self.path, lines, comment_markers=self.instance._COMMENT_MARKERS)
        self.instance._raise_error.assert_called_with("Section [group1:unknown] has unknown type: unknown")

    def test_parse_pending_declarations(self):
        lines = ["[group1:children]", "group2"]
        self.instance._compile_patterns = MagicMock()
        self.instance._raise_error = MagicMock()
        self.instance.inventory = MagicMock()
        self.instance.inventory.groups = {}

        self.instance._parse(self.path, lines, comment_markers=self.instance._COMMENT_MARKERS)
        self.instance._raise_error.assert_called_with("%s:%d: Section [%s:children] includes undefined group: %s" % (self.path, 2, "group1", "group2"))

if __name__ == '__main__':
    unittest.main()