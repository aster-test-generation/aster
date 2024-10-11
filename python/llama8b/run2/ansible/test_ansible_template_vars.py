import unittest
from ansible.parsing.yaml.module_utils.yaml import AnsibleYAM


class TestAnsibleJ2Vars(unittest.TestCase):
    def test_init(self):
        templar = object()
        globals = object()
        locals = object()
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(instance._templar, templar)
        self.assertEqual(instance._globals, globals)
        self.assertEqual(instance._locals, locals)

    def test_contains(self):
        templar = object()
        globals = object()
        locals = {'key': 'value'}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertTrue('key' in instance)
        self.assertFalse('non_existent_key' in instance)

    def test_iter(self):
        templar = object()
        globals = object()
        locals = {'key1': 'value1', 'key2': 'value2'}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(list(instance), ['key1', 'key2'])

    def test_len(self):
        templar = object()
        globals = object()
        locals = {'key1': 'value1', 'key2': 'value2'}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(len(instance), 2)

    def test_getitem(self):
        templar = object()
        globals = object()
        locals = {'key': 'value'}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(instance['key'], 'value')
        with self.assertRaises(KeyError):
            instance['non_existent_key']

    def test_add_locals(self):
        templar = object()
        globals = object()
        locals = {'key1': 'value1', 'key2': 'value2'}
        instance = AnsibleJ2Vars(templar, globals, locals)
        new_locals = {'key3': 'value3'}
        new_instance = instance.add_locals(new_locals)
        self.assertEqual(new_instance._locals, {'key1': 'value1', 'key2': 'value2', 'key3': 'value3'})

    def test_str(self):
        templar = object()
        globals = object()
        locals = {'key': 'value'}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(str(instance), 'AnsibleJ2Vars')

    def test_repr(self):
        templar = object()
        globals = object()
        locals = {'key': 'value'}
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(repr(instance), 'AnsibleJ2Vars({})')

    def test_eq(self):
        templar = object()
        globals = object()
        locals1 = {'key1': 'value1', 'key2': 'value2'}
        locals2 = {'key1': 'value1', 'key2': 'value2'}
        instance1 = AnsibleJ2Vars(templar, globals, locals1)
        instance2 = AnsibleJ2Vars(templar, globals, locals2)
        self.assertEqual(instance1, instance2)

    def test_ne(self):
        templar = object()
        globals = object()
        locals1 = {'key1': 'value1', 'key2': 'value2'}
        locals2 = {'key1': 'value1', 'key3': 'value3'}
        instance1 = AnsibleJ2Vars(templar, globals, locals1)
        instance2 = AnsibleJ2Vars(templar, globals, locals2)
        self.assertNotEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()