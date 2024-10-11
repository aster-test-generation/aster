import unittest
from ansible.module_utils.basic import


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action = ActionModule()
        result = action.run()
        self.assertEqual(result, {"failed": False, "msg": "Hello world!"})

    def test_run_with_msg(self):
        action = ActionModule()
        result = action.run({"msg": "Hello again!"})
        self.assertEqual(result, {"failed": False, "msg": "Hello again!"})

    def test_run_with_var(self):
        action = ActionModule()
        result = action.run({"var": "hello"})
        self.assertEqual(result, {"failed": False, "hello": "hello"})

    def test_run_with_verbosity(self):
        action = ActionModule()
        result = action.run({"verbosity": 1})
        self.assertEqual(result, {"failed": False, "msg": "Hello world!"})

    def test_run_with_incompatible_options(self):
        action = ActionModule()
        result = action.run({"msg": "Hello", "var": "hello"})
        self.assertEqual(result, {"failed": True, "msg": "'msg' and 'var' are incompatible options"})

    def test_display_verbosity(self):
        action = ActionModule()
        action._display.verbosity = 1
        result = action.run()
        self.assertEqual(result, {"failed": False, "msg": "Hello world!"})

    def test_display_verbosity_too_low(self):
        action = ActionModule()
        action._display.verbosity = 0
        result = action.run()
        self.assertEqual(result, {"skipped": True, "skipped_reason": "Verbosity threshold not met."})

    def test_template(self):
        action = ActionModule()
        result = action._templar.template("{{ hello }}", convert_bare=True, fail_on_undefined=True)
        self.assertEqual(result, "hello")

    def test_template_undefined_variable(self):
        action = ActionModule()
        with self.assertRaises(AnsibleUndefinedVariable):
            action._templar.template("{{ undefined_variable }}", convert_bare=True, fail_on_undefined=True)

    def test_template_list(self):
        action = ActionModule()
        result = action._templar.template("[{{ hello }}, {{ world }}]", convert_bare=True, fail_on_undefined=True)
        self.assertEqual(result, "[hello, world]")

    def test_template_dict(self):
        action = ActionModule()
        result = action._templar.template("{{ {hello: 'hello', world: 'world'} }}", convert_bare=True, fail_on_undefined=True)
        self.assertEqual(result, '{"hello": "hello", "world": "world"}')

    def test_str(self):
        action = ActionModule()
        result = str(action)
        self.assertEqual(result, "ActionModule")

    def test_repr(self):
        action = ActionModule()
        result = repr(action)
        self.assertEqual(result, "ActionModule()")

    def test_eq(self):
        action1 = ActionModule()
        action2 = ActionModule()
        self.assertEqual(action1, action2)

if __name__ == '__main__':
    unittest.main()