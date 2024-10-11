import unittest
from ansible.parsing.mod_args import ModuleArgsParser
from ansible.errors import AnsibleParserError, AnsibleError, AnsibleAssertionError
from ansible.utils.sentinel import Sentinel

class TestModuleArgsParser(unittest.TestCase):

    def test_init_with_valid_task_ds(self):
        task_ds = {'action': 'copy src=a dest=b'}
        parser = ModuleArgsParser(task_ds)
        self.assertEqual(parser._task_ds, task_ds)

    def test_init_with_invalid_task_ds(self):
        with self.assertRaises(AnsibleAssertionError):
            ModuleArgsParser(task_ds="invalid")

    def test_split_module_string_with_multiple_tokens(self):
        parser = ModuleArgsParser()
        result = parser._split_module_string('copy src=a dest=b')
        self.assertEqual(result, ('copy', 'src=a dest=b'))

    def test_split_module_string_with_single_token(self):
        parser = ModuleArgsParser()
        result = parser._split_module_string('copy')
        self.assertEqual(result, ('copy', ''))

    def test_normalize_parameters_with_additional_args_as_string(self):
        parser = ModuleArgsParser()
        with self.assertRaises(AnsibleParserError):
            parser._normalize_parameters('thing', additional_args='{{var}}')

    def test_normalize_parameters_with_additional_args_as_dict(self):
        parser = ModuleArgsParser()
        result = parser._normalize_parameters('thing', additional_args={'key': 'value'})
        self.assertEqual(result, (None, {'key': 'value'}))

    def test_normalize_parameters_with_invalid_additional_args(self):
        parser = ModuleArgsParser()
        with self.assertRaises(AnsibleParserError):
            parser._normalize_parameters('thing', additional_args=123)

    def test_normalize_new_style_args_with_dict(self):
        parser = ModuleArgsParser()
        result = parser._normalize_new_style_args({'key': 'value'}, 'action')
        self.assertEqual(result, {'key': 'value'})

    def test_normalize_new_style_args_with_string(self):
        parser = ModuleArgsParser()
        result = parser._normalize_new_style_args('key=value', 'action')
        self.assertEqual(result, {'key': 'value'})

    def test_normalize_new_style_args_with_none(self):
        parser = ModuleArgsParser()
        result = parser._normalize_new_style_args(None, 'action')
        self.assertIsNone(result)

    def test_normalize_new_style_args_with_invalid_type(self):
        parser = ModuleArgsParser()
        with self.assertRaises(AnsibleParserError):
            parser._normalize_new_style_args(123, 'action')

    def test_normalize_old_style_args_with_dict(self):
        parser = ModuleArgsParser()
        result = parser._normalize_old_style_args({'module': 'copy src=a dest=b'})
        self.assertEqual(result, ('copy', {'src': 'a', 'dest': 'b'}))

    def test_normalize_old_style_args_with_string(self):
        parser = ModuleArgsParser()
        result = parser._normalize_old_style_args('copy src=a dest=b')
        self.assertEqual(result, ('copy', {'src': 'a', 'dest': 'b'}))

    def test_normalize_old_style_args_with_invalid_type(self):
        parser = ModuleArgsParser()
        with self.assertRaises(AnsibleParserError):
            parser._normalize_old_style_args(123)

    def test_parse_with_action(self):
        task_ds = {'action': 'copy src=a dest=b'}
        parser = ModuleArgsParser(task_ds)
        result = parser.parse()
        self.assertEqual(result, ('copy', {'src': 'a', 'dest': 'b'}, Sentinel))

    def test_parse_with_local_action(self):
        task_ds = {'local_action': 'copy src=a dest=b'}
        parser = ModuleArgsParser(task_ds)
        result = parser.parse()
        self.assertEqual(result, ('copy', {'src': 'a', 'dest': 'b'}, 'localhost'))

    def test_parse_with_conflicting_actions(self):
        task_ds = {'action': 'copy src=a dest=b', 'local_action': 'copy src=c dest=d'}
        parser = ModuleArgsParser(task_ds)
        with self.assertRaises(AnsibleParserError):
            parser.parse()

    def test_parse_with_non_task_ds(self):
        task_ds = {'invalid_key': 'value'}
        parser = ModuleArgsParser(task_ds)
        with self.assertRaises(AnsibleParserError):
            parser.parse()

    def test_parse_with_no_action(self):
        task_ds = {}
        parser = ModuleArgsParser(task_ds)
        with self.assertRaises(AnsibleParserError):
            parser.parse()

    def test_parse_with_raw_params(self):
        task_ds = {'action': 'copy src=a dest=b', 'args': {'_raw_params': 'echo hi'}}
        parser = ModuleArgsParser(task_ds)
        with self.assertRaises(AnsibleParserError):
            parser.parse()

if __name__ == '__main__':
    unittest.main()