import unittest
from unittest.mock import MagicMock, patch
from ansible.template.vars import AnsibleJ2Vars
from ansible.errors import AnsibleError, AnsibleUndefinedVariable


class TestAnsibleJ2Vars(unittest.TestCase):
    def setUp(self):
        self.templar = MagicMock()
        self.templar.available_variables = {'var1': 'value1', 'var2': 'value2'}
        self.globals = {'global1': 'gvalue1'}
        self.locals = {'local1': 'lvalue1'}
        self.instance = AnsibleJ2Vars(self.templar, self.globals, self.locals)

    def test_init(self):
        self.assertEqual(self.instance._templar, self.templar)
        self.assertEqual(self.instance._globals, self.globals)
        self.assertEqual(self.instance._locals, {'local1': 'lvalue1'})

    def test_contains_local(self):
        self.assertTrue('local1' in self.instance)

    def test_contains_templar(self):
        self.assertTrue('var1' in self.instance)

    def test_contains_global(self):
        self.assertTrue('global1' in self.instance)

    def test_contains_not_found(self):
        self.assertFalse('notfound' in self.instance)

    def test_iter(self):
        keys = set(iter(self.instance))
        expected_keys = {'var1', 'var2', 'local1', 'global1'}
        self.assertEqual(keys, expected_keys)

    def test_len(self):
        self.assertEqual(len(self.instance), 4)

    def test_getitem_local(self):
        self.assertEqual(self.instance['local1'], 'lvalue1')

    def test_getitem_templar(self):
        self.templar.template = MagicMock(return_value='templated_value')
        self.assertEqual(self.instance['var1'], 'templated_value')

    def test_getitem_global(self):
        self.assertEqual(self.instance['global1'], 'gvalue1')

    def test_getitem_keyerror(self):
        with self.assertRaises(KeyError):
            self.instance['notfound']

    @patch('ansible.template.vars.HostVars')
    def test_getitem_hostvars(self, MockHostVars):
        self.templar.available_variables = {'vars': MockHostVars}
        self.assertEqual(self.instance['vars'], MockHostVars)

    def test_getitem_ansible_undefined_variable(self):
        self.templar.template = MagicMock(side_effect=AnsibleUndefinedVariable('undefined'))
        with self.assertRaises(AnsibleUndefinedVariable):
            self.instance['var1']

    def test_getitem_ansible_error(self):
        self.templar.template = MagicMock(side_effect=Exception('error'))
        with self.assertRaises(AnsibleError):
            self.instance['var1']

    def test_add_locals(self):
        new_locals = {'new_local': 'new_value'}
        new_instance = self.instance.add_locals(new_locals)
        self.assertEqual(new_instance._locals['new_local'], 'new_value')

    def test_add_locals_none(self):
        new_instance = self.instance.add_locals(None)
        self.assertEqual(new_instance, self.instance)

if __name__ == '__main__':
    unittest.main()