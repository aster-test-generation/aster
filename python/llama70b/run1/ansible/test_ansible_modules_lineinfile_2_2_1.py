import unittest
from ansible.modules.lineinfile import Lineinfile, check_file_attrs


class TestLineinfile(unittest.TestCase):
    def test___init__(self):
        instance = Lineinfile(module=AnsibleModule(argument_spec={}))
        self.assertIsInstance(instance, Lineinfile)

    def test_run(self):
        instance = Lineinfile(module=AnsibleModule(argument_spec={}))
        result = instance.run()
        self.assertIsInstance(result, dict)

    def test_create_backup(self):
        instance = Lineinfile(module=AnsibleModule(argument_spec={}))
        result = instance.create_backup()
        self.assertIsInstance(result, bool)

    def test_insert_line(self):
        instance = Lineinfile(module=AnsibleModule(argument_spec={}))
        result = instance.insert_line('path', 'line', 'regexp')
        self.assertIsInstance(result, bool)

    def test_replace_line(self):
        instance = Lineinfile(module=AnsibleModule(argument_spec={}))
        result = instance.replace_line('path', 'line', 'regexp')
        self.assertIsInstance(result, bool)

    def test_remove_line(self):
        instance = Lineinfile(module=AnsibleModule(argument_spec={}))
        result = instance.remove_line('path', 'regexp')
        self.assertIsInstance(result, bool)

    def test__get_regexp(self):
        instance = Lineinfile(module=AnsibleModule(argument_spec={}))
        result = instance._Lineinfile__get_regexp('regexp')
        self.assertIsInstance(result, re.Pattern)

    def test__get_search_string(self):
        instance = Lineinfile(module=AnsibleModule(argument_spec={}))
        result = instance._Lineinfile__get_search_string('search_string')
        self.assertIsInstance(result, str)

    def test__insert_line_after(self):
        instance = Lineinfile(module=AnsibleModule(argument_spec={}))
        result = instance._Lineinfile__insert_line_after('path', 'line', 'regexp')
        self.assertIsInstance(result, bool)

    def test__insert_line_before(self):
        instance = Lineinfile(module=AnsibleModule(argument_spec={}))
        result = instance._Lineinfile__insert_line_before('path', 'line', 'regexp')
        self.assertIsInstance(result, bool)

    def test__str__(self):
        instance = Lineinfile(module=AnsibleModule(argument_spec={}))
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test__repr__(self):
        instance = Lineinfile(module=AnsibleModule(argument_spec={}))
        result = instance.__repr__()
        self.assertIsInstance(result, str)

class TestCheckFileAttrs(unittest.TestCase):
    def test_check_file_attrs(self):
        module = AnsibleModule(argument_spec={})
        changed = True
        message = 'message'
        diff = {}
        result = check_file_attrs(module, changed, message, diff)
        self.assertIsInstance(result, tuple)

if __name__ == '__main__':
    unittest.main()