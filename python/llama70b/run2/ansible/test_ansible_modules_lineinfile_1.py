import unittest
from ansible.modules.lineinfile import LineinfileModule


class TestLineinfileModule(unittest.TestCase):
    def test___init__(self):
        instance = LineinfileModule()
        self.assertIsInstance(instance, LineinfileModule)

    def test___str__(self):
        instance = LineinfileModule()
        result = str(instance)
        self.assertEqual(result, "LineinfileModule")

    def test___repr__(self):
        instance = LineinfileModule()
        result = repr(instance)
        self.assertEqual(result, "LineinfileModule()")

    def test_run(self):
        instance = LineinfileModule()
        result = instance.run()
        self.assertEqual(result, {})

    def test_main(self):
        instance = LineinfileModule()
        result = instance.main()
        self.assertEqual(result, {})

    def test_create_backup(self):
        instance = LineinfileModule()
        result = instance.create_backup()
        self.assertIsNone(result)

    def test_insert_line(self):
        instance = LineinfileModule()
        result = instance.insert_line("path", "line", "regexp")
        self.assertIsNone(result)

    def test_replace_line(self):
        instance = LineinfileModule()
        result = instance.replace_line("path", "line", "regexp")
        self.assertIsNone(result)

    def test_remove_line(self):
        instance = LineinfileModule()
        result = instance.remove_line("path", "regexp")
        self.assertIsNone(result)

    def test__get_insert_position(self):
        instance = LineinfileModule()
        result = instance._get_insert_position("path", "regexp", "insertafter")
        self.assertIsNone(result)

    def test__get_search_string(self):
        instance = LineinfileModule()
        result = instance._get_search_string("search_string")
        self.assertEqual(result, "search_string")

    def test__get_regexp(self):
        instance = LineinfileModule()
        result = instance._get_regexp("regexp")
        self.assertEqual(result, re.compile("regexp"))

    def test__get_line(self):
        instance = LineinfileModule()
        result = instance._get_line("line")
        self.assertEqual(result, "line")

    def test__get_state(self):
        instance = LineinfileModule()
        result = instance._get_state("state")
        self.assertEqual(result, "state")

    def test__get_backrefs(self):
        instance = LineinfileModule()
        result = instance._get_backrefs(True)
        self.assertTrue(result)

    def test__get_insertbefore(self):
        instance = LineinfileModule()
        result = instance._get_insertbefore("insertbefore")
        self.assertEqual(result, "insertbefore")

    def test__get_insertafter(self):
        instance = LineinfileModule()
        result = instance._get_insertafter("insertafter")
        self.assertEqual(result, "insertafter")

    def test__get_create(self):
        instance = LineinfileModule()
        result = instance._get_create(True)
        self.assertTrue(result)

    def test__get_backup(self):
        instance = LineinfileModule()
        result = instance._get_backup(True)
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()