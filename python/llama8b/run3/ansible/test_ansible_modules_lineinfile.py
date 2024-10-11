import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils._text import to_bytes, to_native, to_text
from ansible.module_utils._text import to_bytes, is_binar


class TestLineinfileModule(unittest.TestCase):
    def test_lineinfile_module_init(self):
        module = LineinfileModule()
        self.assertEqual(module.__class__.__name__, 'LineinfileModule')

    def test_lineinfile_module_run(self):
        module = LineinfileModule()
        result = module.run()
        self.assertEqual(result, None)

    def test_lineinfile_module_create(self):
        module = LineinfileModule()
        result = module.create()
        self.assertEqual(result, None)

    def test_lineinfile_module_backup(self):
        module = LineinfileModule()
        result = module.backup()
        self.assertEqual(result, None)

    def test_lineinfile_module_firstmatch(self):
        module = LineinfileModule()
        result = module.firstmatch()
        self.assertEqual(result, None)

    def test_lineinfile_module_insertafter(self):
        module = LineinfileModule()
        result = module.insertafter()
        self.assertEqual(result, None)

    def test_lineinfile_module_insertbefore(self):
        module = LineinfileModule()
        result = module.insertbefore()
        self.assertEqual(result, None)

    def test_lineinfile_module_search_string(self):
        module = LineinfileModule()
        result = module.search_string()
        self.assertEqual(result, None)

    def test_lineinfile_module_regexp(self):
        module = LineinfileModule()
        result = module.regexp()
        self.assertEqual(result, None)

    def test_lineinfile_module_line(self):
        module = LineinfileModule()
        result = module.line()
        self.assertEqual(result, None)

    def test_lineinfile_module_backrefs(self):
        module = LineinfileModule()
        result = module.backrefs()
        self.assertEqual(result, None)

    def test_lineinfile_module_state(self):
        module = LineinfileModule()
        result = module.state()
        self.assertEqual(result, None)

    def test_lineinfile_module_path(self):
        module = LineinfileModule()
        result = module.path()
        self.assertEqual(result, None)

    def test_lineinfile_module_others(self):
        module = LineinfileModule()
        result = module.others()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()