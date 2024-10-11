import unittest
from ansible.context import CLIArgs, GlobalCLIArgs, _init_global_context, cliargs_deferred_get, CLIARGS
from ansible.module_utils.common._collections_compat import Mapping, Set
from ansible.module_utils.common.collections import is_sequence


class TestAnsibleContext(unittest.TestCase):
    def setUp(self):
        self.cli_args = {'option1': 'value1', 'option2': 'value2'}
        _init_global_context(self.cli_args)

    def test_init_global_context(self):
        _init_global_context(self.cli_args)
        self.assertIsInstance(CLIARGS, GlobalCLIArgs)

    def test_cliargs_deferred_get_default(self):
        deferred_get = cliargs_deferred_get('nonexistent_key', default='default_value')
        self.assertEqual(deferred_get(), 'default_value')

    def test_cliargs_deferred_get_existing_key(self):
        deferred_get = cliargs_deferred_get('option1')
        self.assertEqual(deferred_get(), 'value1')

    def test_cliargs_deferred_get_shallowcopy_sequence(self):
        CLIARGS['sequence_key'] = [1, 2, 3]
        deferred_get = cliargs_deferred_get('sequence_key', shallowcopy=True)
        self.assertEqual(deferred_get(), [1, 2, 3])
        self.assertIsNot(deferred_get(), CLIARGS['sequence_key'])

    def test_cliargs_deferred_get_shallowcopy_mapping(self):
        CLIARGS['mapping_key'] = {'a': 1, 'b': 2}
        deferred_get = cliargs_deferred_get('mapping_key', shallowcopy=True)
        self.assertEqual(deferred_get(), {'a': 1, 'b': 2})
        self.assertIsNot(deferred_get(), CLIARGS['mapping_key'])

    def test_cliargs_deferred_get_shallowcopy_set(self):
        CLIARGS['set_key'] = {1, 2, 3}
        deferred_get = cliargs_deferred_get('set_key', shallowcopy=True)
        self.assertEqual(deferred_get(), {1, 2, 3})
        self.assertIsNot(deferred_get(), CLIARGS['set_key'])

    def test_cliargs_deferred_get_no_shallowcopy(self):
        CLIARGS['key'] = 'value'
        deferred_get = cliargs_deferred_get('key', shallowcopy=False)
        self.assertEqual(deferred_get(), 'value')

if __name__ == '__main__':
    unittest.main()