import unittest
from ansible.plugins.action import shell as ActionModule


class TestActionModule(unittest.TestCase):
    def test_run(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertEqual(result, None)

    def test_run_with_tmp(self):
        instance = ActionModule()
        result = instance.run(tmp='tmp', task_vars=None)
        self.assertEqual(result, None)

    def test_run_with_task_vars(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars={'_uses_shell': True})
        self.assertEqual(result, None)

    def test_run_with_tmp_and_task_vars(self):
        instance = ActionModule()
        result = instance.run(tmp='tmp', task_vars={'_uses_shell': True})
        self.assertEqual(result, None)

    def test__uses_shell(self):
        instance = ActionModule()
        result = instance._uses_shell()
        self.assertEqual(result, True)

    def test__uses_check_mode(self):
        instance = ActionModule()
        result = instance._uses_check_mode()
        self.assertEqual(result, False)

    def test__get_command_string(self):
        instance = ActionModule()
        result = instance._get_command_string()
        self.assertEqual(result, None)

    def test__get_stdin(self):
        instance = ActionModule()
        result = instance._get_stdin()
        self.assertEqual(result, None)

    def test__get_environment(self):
        instance = ActionModule()
        result = instance._get_environment()
        self.assertEqual(result, {})

    def test__get_path_args(self):
        instance = ActionModule()
        result = instance._get_path_args()
        self.assertEqual(result, [])

    def test__get_executable(self):
        instance = ActionModule()
        result = instance._get_executable()
        self.assertEqual(result, None)

    def test__get_prompt(self):
        instance = ActionModule()
        result = instance._get_prompt()
        self.assertEqual(result, None)

    def test__get_prompt_regex(self):
        instance = ActionModule()
        result = instance._get_prompt_regex()
        self.assertEqual(result, None)

    def test__get_transport(self):
        instance = ActionModule()
        result = instance._get_transport()
        self.assertEqual(result, 'local')

    def test__get_su(self):
        instance = ActionModule()
        result = instance._get_su()
        self.assertEqual(result, False)

    def test__get_su_user(self):
        instance = ActionModule()
        result = instance._get_su_user()
        self.assertEqual(result, None)

    def test__get_su_pass(self):
        instance = ActionModule()
        result = instance._get_su_pass()
        self.assertEqual(result, None)

    def test__get_pipelining(self):
        instance = ActionModule()
        result = instance._get_pipelining()
        self.assertEqual(result, False)

    def test__get_executable_and_args(self):
        instance = ActionModule()
        result = instance._get_executable_and_args()
        self.assertEqual(result, (None, []))

    def test__get_password(self):
        instance = ActionModule()
        result = instance._get_password()
        self.assertEqual(result, None)

    def test__get_prompt_and_response(self):
        instance = ActionModule()
        result = instance._get_prompt_and_response()
        self.assertEqual(result, (None, None))

    def test__get_prompt_and_response_with_password(self):
        instance = ActionModule()
        result = instance._get_prompt_and_response(password='password')
        self.assertEqual(result, (None, None))

    def test__get_prompt_and_response_with_prompt(self):
        instance = ActionModule()
        result = instance._get_prompt_and_response(prompt='prompt')
        self.assertEqual(result, (None, None))

    def test__get_prompt_and_response_with_response(self):
        instance = ActionModule()
        result = instance._get_prompt_and_response(response='response')
        self.assertEqual(result, (None, None))

if __name__ == '__main__':
    unittest.main()