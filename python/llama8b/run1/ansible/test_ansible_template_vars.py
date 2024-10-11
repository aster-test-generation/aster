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
        locals = object()
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertTrue(instance.__contains__('key'))
        self.assertFalse(instance.__contains__('non_existent_key'))

    def test_iter(self):
        templar = object()
        globals = object()
        locals = object()
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(list(instance), [])

    def test_len(self):
        templar = object()
        globals = object()
        locals = object()
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(len(instance), 0)

    def test_getitem(self):
        templar = object()
        globals = object()
        locals = object()
        instance = AnsibleJ2Vars(templar, globals, locals)
        with self.assertRaises(KeyError):
            instance['non_existent_key']

    def test_add_locals(self):
        templar = object()
        globals = object()
        locals = object()
        instance = AnsibleJ2Vars(templar, globals, locals)
        new_locals = {'new_key': 'new_value'}
        new_instance = instance.add_locals(new_locals)
        self.assertEqual(new_instance._locals, locals.copy())
        self.assertEqual(new_instance._locals, new_locals)

    def test_str(self):
        templar = object()
        globals = object()
        locals = object()
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(str(instance), 'AnsibleJ2Vars')

    def test_repr(self):
        templar = object()
        globals = object()
        locals = object()
        instance = AnsibleJ2Vars(templar, globals, locals)
        self.assertEqual(repr(instance), 'AnsibleJ2Vars({})')

    def test_eq(self):
        templar = object()
        globals = object()
        locals = object()
        instance1 = AnsibleJ2Vars(templar, globals, locals)
        instance2 = AnsibleJ2Vars(templar, globals, locals)
        self.assertTrue(instance1 == instance2)

if __name__ == '__main__':
    unittest.main()