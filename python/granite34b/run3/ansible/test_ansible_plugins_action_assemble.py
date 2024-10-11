import unittest
from ansible.plugins.action.assemble import ActionModule


class TestActionModule(unittest.TestCase):
    def test_assemble_from_fragments(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        src_path = '/path/to/fragments'
        delimiter = '\n'
        compiled_regexp = re.compile(r'\.txt$')
        ignore_hidden = True
        decrypt = False
        result = action_module._assemble_from_fragments(src_path, delimiter, compiled_regexp, ignore_hidden, decrypt)
        self.assertEqual(result, '/path/to/temp_file')

    def test_run(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        tmp = '/path/to/tmp'
        task_vars = {'var1': 'value1', 'var2': 'value2'}
        result = action_module.run(tmp, task_vars)
        self.assertEqual(result, {'key1': 'value1', 'key2': 'value2'})

if __name__ == '__main__':
    unittest.main()